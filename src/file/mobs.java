package file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import com.google.gson.JsonObject;

import data.color;
import data.monster;

import java.util.Random;

public class mobs {
    static String info_system = "【後台】 ";

    // 讀取是否有檔案
    public void create_file() throws Exception {
        File equipJson = new File("config/mobs.json");
        if (!equipJson.exists()) {
            // 創建 檔案數據
            JsonObject obj = new JsonObject();

            // 預設列表
            // mob1 殭屍
            JsonObject mob1 = new JsonObject();
            mob1.addProperty("name", "殭屍");
            mob1.addProperty("LV", 1);
            mob1.addProperty("HP", 20);
            mob1.addProperty("HP_max", 1);
            mob1.addProperty("MP", 0);
            mob1.addProperty("MP_max", 0);
            mob1.addProperty("Damage", 2);
            mob1.addProperty("Hit", 0);
            mob1.addProperty("Defense", 2);
            mob1.addProperty("EXP", 5);
            mob1.addProperty("GOLD", 5);
            // mob1隨機對話
            mob1.addProperty("talk1", "噁....");
            mob1.addProperty("talk2", "殭屍哀號聲~~");
            mob1.addProperty("talk3", "噁 噁.....");
            mob1.addProperty("talk4", "殭屍在吼叫~~");
            obj.add("mob1", mob1);

            // mob2 骷髏
            JsonObject mob2 = new JsonObject();
            mob2.addProperty("name", "骷髏");
            mob2.addProperty("LV", 1);
            mob2.addProperty("HP", 18);
            mob2.addProperty("HP_max", 1);
            mob2.addProperty("MP", 0);
            mob2.addProperty("MP_max", 0);
            mob2.addProperty("Damage", 2);
            mob2.addProperty("Hit", 0);
            mob2.addProperty("Defense", 1);
            mob2.addProperty("EXP", 4);
            mob2.addProperty("GOLD", 3);
            // mob2隨機對話
            mob2.addProperty("talk1", "骨頭敲擊聲");
            mob2.addProperty("talk2", "骨頭敲擊聲");
            mob2.addProperty("talk3", "骨頭敲擊聲");
            mob2.addProperty("talk4", "骨頭敲擊聲");
            obj.add("mob2", mob2);

            // mob3 海妖
            JsonObject mob3 = new JsonObject();
            mob3.addProperty("name", "海妖");
            mob3.addProperty("LV", 2);
            mob3.addProperty("HP", 30);
            mob3.addProperty("HP_max", 1);
            mob3.addProperty("MP", 10);
            mob3.addProperty("MP_max", 0);
            mob3.addProperty("Damage", 3);
            mob3.addProperty("Hit", 0);
            mob3.addProperty("Defense", 2);
            mob3.addProperty("EXP", 8);
            mob3.addProperty("GOLD", 7);
            // mob3隨機對話
            mob3.addProperty("talk1", "優美著旋律伴隨著");
            mob3.addProperty("talk2", "神秘的聲音 吸引著你");
            mob3.addProperty("talk3", "唱歌~~");
            mob3.addProperty("talk4", "殭屍在吼叫~~");
            obj.add("mob3", mob3);
            // 結束

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonData = gson.toJson(obj);
            // write to file
            FileWriter writer = new FileWriter(equipJson);
            writer.write(jsonData);
            writer.close();
            System.out.println(info_system + "- 創建 生物_mobs");
        } else {
            System.out.println(info_system + "- 讀取 生物_mobs");
        }
        // getNPC1Talk();
        // getNPC2Talk();
        // getNPC3Talk();
    }

    int talktype;
    // 未實施
    int talktype_use;

    // 隨機NPC
    // 對話 + 讀取 data
    public void random_npc() throws Exception {
        Random rand = new Random();
        talktype = rand.nextInt(3) + 1;
        getmobdata();
        // getmobTalk();

    }

    // mob 隨機對話
    public void getmobTalk() throws Exception {
        Gson gson = new Gson();
        FileReader reader = new FileReader("config/mobs.json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject player = jsonObject.getAsJsonObject("mob" + talktype);
        String name = player.get("name").getAsString();
        System.out.println("----------");
        int talkNumber = new Random().nextInt(4) + 1;
        String talk = player.get("talk" + talkNumber).getAsString();
        System.out.println(name + ": " + talk);
        System.out.println("----------");
    }

    // 讀取 mob數值
    public void getmobdata() throws Exception {
        Gson gson = new Gson();
        FileReader reader = new FileReader("config/mobs.json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject mob = jsonObject.getAsJsonObject("mob" + talktype);
        monster.name = color.cc + mob.get("name").getAsString() + color.cf;
        monster.LV = mob.get("LV").getAsInt();
        monster.HP = mob.get("HP").getAsInt();
        monster.HP_max = monster.HP;
        monster.MP = mob.get("MP").getAsInt();
        monster.MP_max = monster.MP;
        monster.Damage = mob.get("Damage").getAsInt();
        monster.Hit = mob.get("Hit").getAsInt();
        monster.EXP = mob.get("EXP").getAsInt();
        monster.Gold = mob.get("GOLD").getAsInt();
    }
}
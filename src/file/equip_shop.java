package file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import com.google.gson.JsonObject;
import java.util.Random;

public class equip_shop {
    static String info_system = "【後台】 ";

    // 讀取是否有檔案
    public void create_file() throws Exception {
        File equipJson = new File("config/equip_npc.json");
        if (!equipJson.exists()) {
            // 創建 檔案數據
            JsonObject obj = new JsonObject();

            // 以下由 好想想蜘蛛 給予 "D
            // NPC1 蕾米
            JsonObject NPC1 = new JsonObject();
            NPC1.addProperty("name", "蕾米");
            NPC1.addProperty("talk1", "冒...冒險者、能請你買一點東西嗎？我需要錢幫生病的媽媽買藥");
            NPC1.addProperty("talk2", "裝備怎麼來的？是過世的爸爸留下來的遺物......");
            NPC1.addProperty("talk3", "城內有我的懸賞海報？(小聲嘀咕)嘖，是時候該換地方了嗎");
            NPC1.addProperty("talk4", "冒險者、能請你......是你啊，老樣子、你隨便看看。");
            obj.add("NPC1", NPC1);
            // NPC2 托爾特
            JsonObject NPC2 = new JsonObject();
            NPC2.addProperty("name", "托爾特");
            NPC2.addProperty("talk1", "你那瘦弱的身板很需要一件護甲，不然哪天可能隨便挨個一刀人就沒了。");
            NPC2.addProperty("talk2", "唉、羅克達，多希望再次見到你在戰場上奮勇殺敵的樣子啊。");
            NPC2.addProperty("talk3", "這件胸甲、看著你穿了20年了，你卻從來不捨得換下。");
            NPC2.addProperty("talk4", "謝謝你，我是時候該走了。");
            obj.add("NPC2", NPC2);
            // NPC3 塔內
            JsonObject NPC3 = new JsonObject();
            NPC3.addProperty("name", "塔內");
            NPC3.addProperty("talk1", "有沒有人提醒過你該買件護甲了？");
            NPC3.addProperty("talk2", "放下那把武器，你不適合它的。");
            NPC3.addProperty("talk3", "試試這件、你的身型剛好合適。");
            NPC3.addProperty("talk4", "你該去適應一下新裝備了，注意別死。");
            obj.add("NPC3", NPC3);
            // 結束

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonData = gson.toJson(obj);
            // write to file
            FileWriter writer = new FileWriter(equipJson);
            writer.write(jsonData);
            writer.close();
            System.out.println(info_system + "- 創建 商人_NPC");
        } else {
            System.out.println(info_system + "- 讀取 商人_NPC");
        }
        // getNPC1Talk();
        // getNPC2Talk();
        // getNPC3Talk();
    }

    int talktype;

    // 隨機NPC
    public void random_npc() throws Exception {
        Random rand = new Random();
        talktype = rand.nextInt(3) + 1;
        getNPCTalk();
    }

    // NPC1 隨機對話
    public void getNPCTalk() throws Exception {
        Gson gson = new Gson();
        FileReader reader = new FileReader("config/equip_npc.json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject player = jsonObject.getAsJsonObject("NPC" + talktype);
        String name = player.get("name").getAsString();
        System.out.println("----------");
        int talkNumber = new Random().nextInt(4) + 1;
        String talk = player.get("talk" + talkNumber).getAsString();
        System.out.println(name + ": " + talk);
        System.out.println("----------");
    }
}

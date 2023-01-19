package npc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import com.google.gson.JsonObject;
import java.util.Random;

public class skill {
    static String info_system = "【後台】 ";

    // 讀取是否有檔案
    public void create_file() throws Exception {
        File equipJson = new File("config/skill_npc.json");
        if (!equipJson.exists()) {
            // 創建 檔案數據
            JsonObject obj = new JsonObject();

            // 以下由 好想想蜘蛛 給予 "D
            // NPC1 娜伊納
            JsonObject NPC1 = new JsonObject();
            NPC1.addProperty("name", "娜伊納");
            NPC1.addProperty("talk1", "那個...你是來學習的嗎？");
            NPC1.addProperty("talk2", "如果不嫌棄的話，下次也請來找我。");
            NPC1.addProperty("talk3", "神會祝福每一個人，但大多數的事情還是只能靠自己。");
            NPC1.addProperty("talk4", "神會傾聽但不會回應，而我會、需要傾訴時請來找我。");
            obj.add("NPC1", NPC1);
            // NPC2 麥威爾
            JsonObject NPC2 = new JsonObject();
            NPC2.addProperty("name", "麥威爾");
            NPC2.addProperty("talk1", "你想學習什麼？");
            NPC2.addProperty("talk2", "你學習的速度很快，但要學的還有很多。");
            NPC2.addProperty("talk3", "走路抬頭挺胸，不要等到老了退休了、還得被身體的病痛糾纏一生。");
            NPC2.addProperty("talk4", "小心一點，我不希望哪天在城外見到你的屍骨。");
            obj.add("NPC2", NPC2);
            // NPC3 斯蒂諾 • 蜜莉薇
            JsonObject NPC3 = new JsonObject();
            NPC3.addProperty("name", "斯蒂諾 • 蜜莉薇");
            NPC3.addProperty("talk1", "Σ(ﾟДﾟ；≡；ﾟдﾟ)");
            NPC3.addProperty("talk2", "(つд⊂)");
            NPC3.addProperty("talk3", "Σヽ(ﾟД ﾟ; )ﾉ");
            NPC3.addProperty("talk4", "......謝...謝謝");
            obj.add("NPC3", NPC3);
            // 結束

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonData = gson.toJson(obj);
            // write to file
            FileWriter writer = new FileWriter(equipJson);
            writer.write(jsonData);
            writer.close();
            System.out.println(info_system + "- 創建 技能_NPC");
        } else {
            System.out.println(info_system + "- 讀取 技能_NPC");
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

    // NPC 隨機對話
    public void getNPCTalk() throws Exception {
        Gson gson = new Gson();
        FileReader reader = new FileReader("config/skill_npc.json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject player = jsonObject.getAsJsonObject("NPC" + talktype);
        String name = player.get("name").getAsString();
        System.out.println(name + ":");
        System.out.println("----------");
        int talkNumber = new Random().nextInt(4) + 1;
        String talk = player.get("talk" + talkNumber).getAsString();
        System.out.println(" " + talk);
        System.out.println("----------");
    }
}

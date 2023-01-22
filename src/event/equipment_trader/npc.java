package event.equipment_trader;

import java.io.FileReader;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class npc {
    static int talktype;

    // 隨機NPC
    public static void random_npc() throws Exception {
        Random rand = new Random();
        talktype = rand.nextInt(3) + 1;
        getNPCTalk();
    }

    // NPC1 隨機對話
    public static void getNPCTalk() throws Exception {
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

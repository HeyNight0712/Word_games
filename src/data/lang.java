package data;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class lang {
    public static String HP;
    public static String MP;
    public static String Damage;
    public static String Defense;
    public static String LV;
    public static String EXP;
    public static String GOLD;

    public static String lang_use;

    public static String move;
    public static String item;
    public static String attack;
    public static String skill;
    public static String Attributes;
    public static String defense;

    public void color_use() throws Exception {
        lang_use = "zh_tw";
        Gson gson = new Gson();
        FileReader reader = new FileReader("lang/" + lang_use + ".json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject player = jsonObject.getAsJsonObject(lang_use);
        HP = color.cc + player.get("HP").getAsString() + color.cf;
        MP = color.c1 + player.get("MP").getAsString() + color.cf;
        Damage = color.c9 + player.get("Dam").getAsString() + color.cf;
        Defense = color.c9 + player.get("Def").getAsString() + color.cf;
        EXP = color.ca + player.get("EXP").getAsString() + color.cf;
        GOLD = color.ce + player.get("GOLD").getAsString() + color.cf;
        LV = LV;
        move = color.cf + player.get("move").getAsString() + color.cf;
        item = color.c5 + player.get("item").getAsString() + color.cf;
        attack = color.cc + player.get("attack").getAsString() + color.cf;
        skill = color.c1 + player.get("skill").getAsString() + color.cf;
        Attributes = color.ca + player.get("Attributes").getAsString() + color.cf;
        defense = color.c9 + player.get("defense").getAsString() + color.cf;

    }
}

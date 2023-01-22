package data;

import java.io.FileReader;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import discord.start;

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

    public static void lang_use() throws Exception {
        lang_use = "zh_tw";
        Gson gson = new Gson();
        FileReader reader = new FileReader("lang/" + lang_use + ".json");
        JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
        JsonObject player = jsonObject.getAsJsonObject(lang_use);
        HP = player.get("HP").getAsString();
        MP = player.get("MP").getAsString();
        Damage = player.get("Dam").getAsString();
        Defense = player.get("Def").getAsString();
        EXP = player.get("EXP").getAsString();
        GOLD = player.get("GOLD").getAsString();
        move = player.get("move").getAsString();
        item = player.get("item").getAsString();
        attack = player.get("attack").getAsString();
        skill = player.get("skill").getAsString();
        Attributes = player.get("Attributes").getAsString();
        defense = player.get("defense").getAsString();

    }
}

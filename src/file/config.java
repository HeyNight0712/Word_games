package file;

import java.io.File;
import org.json.simple.JSONObject;

import data.color;
import data.player;
import data.lang;
import file.lang.zh_tw;

import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class config {
    static String info_system = "【後台】 ";
    static equip_shop equip = new equip_shop();
    static skill_shop skill = new skill_shop();
    static mobs mobs = new mobs();
    static player player = new player();
    static zh_tw zh_tw = new zh_tw();
    static lang lang = new lang();

    public static void read() throws Exception {
        System.out.println("偵測檔案");
        System.out.println("====================" + color.ce);
        config();
        lang();
        zh_tw.create_file();
        equip.create_file();
        skill.create_file();
        mobs.create_file();
        player.restart();
        lang.color_use();
        System.out.println(color.cf + "====================" + color.cf);
        TimeUnit.SECONDS.sleep(1);
        System.out.println(color.ca + "確認完畢" + color.cf + "\n");
    }

    private static void config() throws Exception {
        File configDir = new File("config");
        if (!configDir.exists()) {
            configDir.mkdir();
            System.out.println(info_system + "- 創建 config");
        } else {
            System.out.println(info_system + "- 讀取 config");
        }
    }

    private static void lang() throws Exception {
        File configDir = new File("lang");
        if (!configDir.exists()) {
            configDir.mkdir();
            System.out.println(info_system + "- 創建 lang");
        } else {
            System.out.println(info_system + "- 讀取 lang");
        }
    }
}

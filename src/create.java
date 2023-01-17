import java.io.File;
import org.json.simple.JSONObject;

import npc.equip;
import npc.skill;
import mobs.mobs;

import java.io.File;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class create {
    static String info_system = "【後台】 ";
    static equip equip = new equip();
    static skill skill = new skill();
    static events event = new events();
    static mobs mobs = new mobs();

    public static void read() throws Exception {
        // 這裡之後會歸入 新檔案
        System.out.println("偵測檔案");
        System.out.println("====================");
        config();
        equip.create_file();
        skill.create_file();
        mobs.create_file();
        System.out.println("====================");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("確認完畢" + "\n");
        // event.Search();
        // 寫來備註用
        // 隨機 武器商人 npc / 對話
        // equip.random_npc();
        // 隨機抽取生物
        // mobs.random_npc();
        // 抽取剛剛生物的 對話 1~4
        // mobs.getmobTalk();
    }

    private static void config() throws Exception {
        File configDir = new File("config");
        if (!configDir.exists()) {
            configDir.mkdir();
            System.out.println(info_system + "- 創建 config");
        } else {
            System.out.println(info_system + "- 讀取 config");
        }
        TimeUnit.SECONDS.sleep(1);
    }
}

package event.set;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import discord.start;

public class load {

    public static void detection() throws Exception {

    }

    public static void read() throws Exception {
        System.out.println("偵測檔案");
        System.out.println("====================");
        file.config.config_folder();
        file.lang.lang_folder();
        file.language.zh_tw.create_file();
        file.equip_shop.create_file();
        file.skill_shop.create_file();
        file.mobs.create_file();
        data.player.restart();
        data.lang.lang_use();
        System.out.println("====================");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("確認完畢" + "\n");
    }

    // 選擇 語言
    public static void lang_choose() throws Exception {
        Scanner lang_text = new Scanner(System.in);
        System.out.println("選擇你的語言");
        System.out.println("============");
        System.out.println("[1] en_us 英文");
        System.out.println("[2] zh_cn 中文(簡體)");
        System.out.println("[3] zh_tw 中文(繁體)");
        System.out.println("============");
    }
}

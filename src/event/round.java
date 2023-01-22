package event;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import data.lang;
import data.monster;
import data.player;
import data.system_value;
import event.fighting.att_def;
import event.fighting.bot.bot;

//計算回合 /天數
public class round {
    // 物件導入
    player player = new player();
    monster mob = new monster();
    system_value system_value = new system_value();
    static bot bot = new bot();
    // 未實施
    public static int Day;

    // 0 代表 我方
    // 1 代表 對方

    public static int Round_ATT;

    static String player_use;

    // 隨機回合
    public static void round_set() throws Exception {
        Random rand = new Random();
        data.system_value.round = rand.nextInt(2);
        who();
    }

    // 隨機回合反應
    public static void who() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        if (data.system_value.round == 0) {
            System.out.println("\n" + "輪到 " + data.player.name);
            System.out.println("==========");
            user();
            data.system_value.round = 1;
        } else if (data.system_value.round == 1) {
            System.out.println("\n" + "輪到 " + monster.name);
            System.out.println("==========");
            bot.probability();
            data.system_value.round = 0;
        } else {
            System.out.println("回合錯誤 請回報!!!");
        }
    }

    public void who2() throws Exception {
        who();
    }

    static att_def combat = new att_def();

    public static String player_text_use = "0";

    // 戰鬥 屬性
    public static void user() throws Exception {
        while (true) {
            Scanner player_text = new Scanner(System.in);
            System.out.println(
                    "[1] " + lang.attack + " [2] " + lang.defense + " [3] " + lang.skill + " [4] " + lang.item
                            + " [5] " + lang.Attributes);
            player_text_use = player_text.nextLine();
            player_use = player_text_use;
            if (player_use.equals("1")) {
                System.out.println("你使用 " + lang.attack);
                combat.ATT();
                break;
            } else if (player_use.equals("2")) {
                System.out.println("你使用 " + lang.defense);
                combat.ATT();
                break;
            } else if (player_use.equals("3")) {
                System.out.println("你使用 " + lang.skill);
                break;
            } else if (player_use.equals("4")) {
                System.out.println("你使用 " + lang.item);
                continue;
            } else if (player_use.equals("5")) {
                System.out.println("你使用 " + lang.Attributes);
                use_Attributes();
                continue;
            } else {
                System.out.println("輸入錯誤 請重新輸入");
            }
        }
    }

    // 查看
    public static void use_Attributes() throws Exception {
        Scanner player_text = new Scanner(System.in);
        System.out.println("[1] " + data.player.name + " [2] " + monster.name);
        String player_text_use = player_text.nextLine();
        player_use = player_text_use;
        if (player_use.equals("1")) {
            System.out.println("你正在查看" + data.player.name);
            data.player.info();
        } else if (player_use.equals("2")) {
            System.out.println("你正在查看" + monster.name);
            data.monster.info();
        } else {
            System.out.println("回到上一步");
        }
        TimeUnit.SECONDS.sleep(1);
    }
}

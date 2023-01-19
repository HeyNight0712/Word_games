package event;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import data.monster;
import data.player;
import data.system_value;
import file.boss;
import file.config;
import data.system_value;

//計算回合 /天數
public class round {
    // 物件導入
    player player = new player();
    monster mob = new monster();
    system_value system_value = new system_value();
    bot bot = new bot();
    // 未實施
    public static int Day;

    // 0 代表 我方
    // 1 代表 對方

    public static int Round_ATT;

    String player_use;

    // 隨機回合
    public void round_set() throws Exception {
        Random rand = new Random();
        system_value.round = rand.nextInt(2);
        who();
    }

    // 隨機回合反應
    public void who() throws Exception {
        if (system_value.round == 0) {
            System.out.println("\n" + "輪到 " + player.name);
            user();
            system_value.round = 1;
        } else if (system_value.round == 1) {
            System.out.println("\n" + "輪到 " + monster.name);
            bot.probability();
            system_value.round = 0;
        } else {
            System.out.println("回合錯誤 請回報!!!");
        }
    }

    public void who2() throws Exception {
        who();
    }

    attack attack = new attack();

    // 戰鬥 屬性
    public void user() throws Exception {
        while (true) {
            Scanner player_text = new Scanner(System.in);
            System.out.println("[1] 攻擊" + " [2] 防禦" + " [3] 技能" + " [4] 道具" + " [5] 屬性");
            String player_text_use = player_text.nextLine();
            player_use = player_text_use;
            if (player_use.equals("1")) {
                System.out.println("你使用 攻擊");
                attack.ATT();
                break;
            } else if (player_use.equals("2")) {
                System.out.println("你使用 防禦");
                break;
            } else if (player_use.equals("3")) {
                System.out.println("你使用 技能");
                break;
            } else if (player_use.equals("4")) {
                System.out.println("你使用 道具");
                continue;
            } else if (player_use.equals("5")) {
                System.out.println("你使用 屬性");
                use_Attributes();
                continue;
            } else {
                System.out.println("輸入錯誤 請重新輸入");
            }
        }
    }

    // 查看
    public void use_Attributes() throws Exception {
        Scanner player_text = new Scanner(System.in);
        System.out.println("[1] " + player.name + " [2] " + monster.name);
        String player_text_use = player_text.nextLine();
        player_use = player_text_use;
        if (player_use.equals("1")) {
            System.out.println("你正在查看自己");
            player.info();
        } else if (player_use.equals("2")) {
            System.out.println("你正在查看對方");
            mob.info();
        } else {
            System.out.println("回到上一步");
        }
        TimeUnit.SECONDS.sleep(1);
    }

    // 獲取資料
    public void getinfo() throws Exception {
        if (system_value.round == 0) {
            System.out.println(monster.name + ":");
            System.out.println("----------");
            System.out.println("HP - " + monster.HP + " / " + monster.HP_max);
            System.out.println("MP - " + monster.MP + " / " + monster.MP_max);
            System.out.println("Dam - " + monster.Damage + " (" + monster.Hit + ")");
            System.out.println("Def - " + monster.Defense);
            system_value.round = 1;
        } else if (system_value.round == 1) {

        }
    }

}

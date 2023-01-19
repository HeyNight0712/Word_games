
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import data.monster;
import data.player;
import npc.boss;

//計算回合 /天數
public class day {
    // 物件導入
    player player = new player();
    monster mob = new monster();
    events event = new events();
    // 未實施
    public static int Day;

    // 0 代表 我方
    // 1 代表 對方
    public static int Round;

    public static int Round_ATT;

    String player_use;

    // 移動 屬性
    public void move() throws Exception {
        while (true) {
            Scanner player_text = new Scanner(System.in);
            System.out.println("[1] " + player.name + " [2] 移動" + " [3] 道具");
            String player_text_use = player_text.nextLine();
            player_use = player_text_use;
            if (player_use.equals("1")) {
                System.out.println("你查看自己");
                player.info();
            } else if (player_use.equals("2")) {
                System.out.println("正在移動");
                event.Search();
                break;
            } else {
                System.out.println("輸入錯誤");
            }
        }
    }

    // 戰鬥 屬性
    public void player() throws Exception {
        while (true) {
            Scanner player_text = new Scanner(System.in);
            System.out.println("[1] 攻擊" + " [2] 防禦" + " [3] 技能" + " [4] 道具" + " [5] 屬性");
            String player_text_use = player_text.nextLine();
            player_use = player_text_use;
            if (player_use.equals("1")) {
                System.out.println("你使用 攻擊");
                break;
            } else if (player_use.equals("2")) {
                System.out.println("你使用 防禦");
                break;
            } else if (player_use.equals("3")) {
                System.out.println("你使用 技能");
                break;
            } else if (player_use.equals("4")) {
                System.out.println("你使用 道具");

            } else if (player_use.equals("5")) {
                System.out.println("你使用 屬性");
                use_Attributes();
            } else {
                System.out.println("輸入錯誤 請重新輸入");
            }
        }
    }

    // 戰鬥_屬性
    public void use_Attributes() throws Exception {
        Scanner player_text = new Scanner(System.in);
        System.out.println("[1] " + player.name + " [2] " + monster.name);
        String player_text_use = player_text.nextLine();
        player_use = player_text_use;
        if (player_use.equals("1")) {
            System.out.println("你查看自己");
            player.info();
        } else if (player_use.equals("2")) {
            System.out.println("你查看對方");
            mob.info();
        } else {
            System.out.println("回到上一步");
        }
        TimeUnit.SECONDS.sleep(1);
    }

    // 獲取資料
    public void getinfo() throws Exception {
        if (Round == 0) {
            System.out.println(monster.name + ":");
            System.out.println("----------");
            System.out.println("HP - " + monster.HP + " / " + monster.HP_max);
            System.out.println("MP - " + monster.MP + " / " + monster.MP_max);
            System.out.println("Dam - " + monster.Damage + " (" + monster.Hit + ")");
            System.out.println("Def - " + monster.Defense);
            Round = 1;
        } else if (Round == 1) {

        }
    }
}

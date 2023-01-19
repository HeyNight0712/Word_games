package event;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import data.monster;
import data.player;
import file.equip_shop;
import file.mobs;
import file.skill_shop;

public class events {
    // 資訊
    public static String info_system = "【系統】 ";
    // 敘述
    static String info_move = "移動中";
    static equip_shop equip = new equip_shop();
    static skill_shop skill = new skill_shop();

    mobs mobs = new mobs();
    attack attack = new attack();
    round round = new round();
    String Random;

    // 玩家名稱
    public void your_name() {
        boolean start = true;
        while (start) {
            Scanner your_name = new Scanner(System.in);
            System.out.println("請輸入你的名子");
            String player_name = your_name.nextLine();
            player.name = player_name;
            boolean start_name = true;
            start_name = true;
            while (start_name) {
                if (player.name.equals("")) {
                    System.out.println("不能輸入空白!!" + "請重新輸入");
                    start_name = false;
                } else {
                    System.out.println("確認你的名子取名為" + player.name + "?");
                    System.out.println("[ Y / N ]");
                    Scanner your_name_text = new Scanner(System.in);
                    String your_name_use = your_name_text.nextLine();
                    if (your_name_use.equals("y") || your_name_use.equals("Y")) {
                        start = false;
                        break;
                    } else if (your_name_use.equals("n") || your_name_use.equals("N")) {
                        break;
                    }
                }

            }
        }
    }

    public void your_name_use() {

    }

    // 尋找事件
    // 機率 60%戰鬥 20%營火 10% 武器/技能
    public void Search() throws Exception {
        String[] event_area = { "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "營火", "營火", "營火", "武器商人",
                "武器商人",
                "魔法商人" };
        Random = event_area[new Random().nextInt(event_area.length)];
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + info_move + ".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + info_move + "..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + info_move + "...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + "事件發生 " + Random);
        event();
    }

    // 尋找事件 回應
    public void event() throws Exception {
        if (Random.equals("戰鬥")) {
            mobs.random_npc();
            System.out.println(info_system + "遇到 : " + monster.name);
            round.round_set();
        } else if (Random.equals("營火")) {
            System.out.println(info_system + "找到休息區域");

        } else if (Random.equals("武器商人")) {
            System.out.println(info_system + "遇見武器商人");
            equip.random_npc();
        } else if (Random.equals("魔法商人")) {
            System.out.println(info_system + "遇見魔法商人");
            skill.random_npc();

        }
    }
}

package event.player;

import java.util.Scanner;

import data.lang;
import data.monster;
import data.player;
import data.system_value;
import event.events;
import event.round;

//全部事件核心控制
public class control {
    // 匯入物件
    system_value system_value = new system_value();
    events events = new events();
    round round = new round();
    player player = new player();
    monster mob = new monster();
    count count = new count();
    int Day;

    public void event_run() throws Exception {
        while (true) {
            Day++;
            System.out.println("今天是第 " + Day + " 天" + "\n");
            move();
            // 戰鬥 結果畫面
            while (data.player.HP >= 1 && monster.HP >= 1) {
                round.who();
                if (monster.HP <= 0) {
                    count.EXP();
                } else if (data.player.HP <= 0) {
                    // 修改
                }
            }
            break;
        }
    }

    // 開始移動
    public void move() throws Exception {
        while (true) {
            Scanner player_text = new Scanner(System.in);
            System.out.println("[1] " + player.name + " [2] " + lang.move + " [3] " + lang.item);
            String player_text_use = player_text.nextLine();
            String player_use = player_text_use;
            if (player_use.equals("1")) {
                System.out.println("你查看自己");
                player.info();
            } else if (player_use.equals("2")) {
                System.out.println("正在移動");
                events.Search();
                break;
            } else if (player_use.equals("3")) {
                System.out.println("歐不 道具 還沒完成");
            } else {
                System.out.println("輸入錯誤");
            }
        }
    }
}

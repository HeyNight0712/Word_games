import java.util.Scanner;

import data.player;
import event.events;
import event.round;
import file.config;
import file.equip_shop;
import file.mobs;
import file.skill_shop;

public class main {
    static boolean player_survive = true;

    public static void main(String[] args) throws Exception {

        // 數值設定 (回合) / (玩家死亡)

        // 設置 物件
        equip_shop equip = new equip_shop();
        skill_shop skill = new skill_shop();
        events event = new events();
        mobs mobs = new mobs();
        config create = new config();
        round round = new round();
        event_control event_control = new event_control();
        // 初始化/玩家屬性

        int Day = 0;
        // 讀取檔案 確保檔案是否遺失
        create.read();
        while ((boolean) player_survive == true) {
            // 開始遊戲 輸入
            System.out.println("\n" + "\n" + "點擊 ENTER 來開始遊戲");
            Scanner start_game_text = new Scanner(System.in);
            String start_game = start_game_text.nextLine();

            // equip.random_npc();
            // equip.getNPCTalk();
            // 玩家死亡
            event.your_name();
            while (player.HP >= 1) {
                event_control.event_control();
                // round.move();
            }
            // 巡路 event.Search();
            // skill.random_npc();

            // 死亡是否 重新 or 結束遊戲 輸入
            System.out.println("\n" + "\n" + "你已死亡" + "\n" + "輸入 Y 來重新開始");
            Scanner start_restart_text = new Scanner(System.in);
            String start_restart = start_game_text.nextLine();
            if (start_restart.equals("Y") || start_restart.equals("y")) {
                System.out.println("你選擇 重新開始遊戲");
                player_survive = true;
            } else {
                System.out.println("\n" + "遊戲結束");
                player_survive = false;
            }
        }
    }

}

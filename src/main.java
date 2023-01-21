import java.nio.charset.Charset;
import java.util.Scanner;

import data.player;
import event.events;
import file.config;

public class main {
    static boolean player_survive = true;

    public static void main(String[] args) throws Exception {

        events event = new events();
        event_control event_control = new event_control();
        // 初始化/玩家屬性

        // 讀取檔案 確保檔案是否遺失
        config.read();
        // run
        while ((boolean) player_survive == true) {
            System.out.println("\n" + "\n" + "點擊 ENTER 來開始遊戲");
            Scanner start_game_text = new Scanner(System.in);
            String start_game = start_game_text.nextLine();
            // 核心
            event.your_name();
            while (player.HP >= 1) {
                event_control.event_run();
            }

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

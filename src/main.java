import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) throws InterruptedException {

        // 數值設定 (回合) / (玩家死亡)
        int round = 0;
        boolean player_survive = true;
        // 設置 物件
        player player = new player();
        event RD = new event();
        aaentity mobs = new aaentity();

        // 初始化/玩家屬性
        player.HP = 20;
        player.HP_max = player.HP;
        player.MP = 10;
        player.MP_max = player.MP;
        player.Damage = 1;
        player.hit = 0;
        player.Defense = 1;
        player.EXP = 0;
        player.EXP_max = 100;
        player.Gold = 0;

        // 設置玩家名稱
        while (player_survive) {

            // 名稱判定
            // 0 取名
            // 1 確認
            // 2 結束
            while (round == 0 || round == 1) {
                if (round == 0) {
                    player.your_name();
                    round = 1;
                }
                if (round == 1) {
                    // 確認
                    Scanner confirm_name1 = new Scanner(System.in);
                    System.out.println("確定名子取 " + player.name + " 嗎?" + "\n" + "[ y / n ]");
                    String confirm = confirm_name1.nextLine();
                    if (confirm.equals("y")) {
                        round = 2;
                    } else if (confirm.equals("n")) {
                        round = 0;
                        continue;
                    }
                }
                // 如果回傳 不是 [y / n]其中 則繞回去
            }
            System.out.println("\n" + "你的名子是 : " + player.name + "\n");

            mob mob = new mob();
            // 事件偵測
            RD.info = 0;
            RD.info_your();
            while (RD.info == 0 || RD.info == 1 || RD.info == 2 || RD.info == 3) {
                RD.info_your();
                if (RD.info == 1) {
                    player.list();
                    TimeUnit.SECONDS.sleep(3);
                } else if (RD.info == 2) {

                } else if (RD.info == 3) {
                    player_survive = false;
                    RD.info = 1000;
                }
            }
            // 結束遊戲
            if (RD.HP <= 0) {
                player_survive = false;
            }
            break;
        }
    }

    // public void info() throws InterruptedException {
    // Scanner info_use = new Scanner(System.in);
    // int info = 0;
    // info = 0;
    // while (info == 0) {
    // System.out.println("[ 1 ] " + "屬性");
    // System.out.println("[ 2 ] " + "移動");
    // System.out.println("[ 3 ] " + "結束遊戲");
    // info = info_use.nextInt();
    // if (info == 1) {
    // player.list();
    // TimeUnit.SECONDS.sleep(1);
    // } else if (info == 2) {
    // event.Search();
    // TimeUnit.SECONDS.sleep(1);
    // } else {
    // System.out.println("輸入錯誤 請重新輸入");
    // info = 0;
    // TimeUnit.SECONDS.sleep(1);
    // }
    // }
    // }
}

import java.util.Random;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        // 設置 bot 隨機值
        String[] event_area = { "ATT", "DEF", "MAGIC" };
        String Randomevent_area = event_area[new Random().nextInt(event_area.length)];

        // 設置 玩家屬性
        mobs player = new mobs();
        player.HP = 100;
        player.DAM = 2;
        player.DEF = 1;

        // 設置 怪物屬性
        mobs mob = new mobs();
        mob.HP = 25;
        mob.HP_max = mob.HP;
        mob.DAM = 1;
        mob.DEF = 0;

        // 我方判定
        try (// 設置玩家輸入
                Scanner scanner = new Scanner(System.in)) {
            // 選擇判定
            while (true) {
                // 回合計算
                // 1 代表 我方(預設)
                // 2 代表 敵方
                int round = 1;
                while (round == 1) {
                    // 自己判定
                    System.out.println("\n" + "請選擇 -> ATT 攻擊 | DEF 防禦 | ITEM 道具 | MAGIC 魔法");
                    String playerMove = scanner.nextLine();

                    if (player.HP <= 0) {
                        break;
                    }
                    // 我方判定 輸入是否成功
                    if (playerMove.equals("ATT") || playerMove.equals("DEF") || playerMove.equals("ITEM")
                            || playerMove.equals("MAGIC")) {

                        // 選擇確認 通知
                        System.out.println("你選擇的是: " + playerMove + "\n");

                        // 選擇 戰鬥
                        if (playerMove.equals("ATT")) {

                            System.out.println(player.Hit());
                            mob.HP = mob.HP - player.C_HIT;
                            System.out.println("敵方生命值: " + mob.HP + " / " + mob.HP_max);
                            round = 2;
                        }

                    } else {
                        System.out.println(playerMove + " 你輸入的是錯誤資訊" + " 請重新輸入" + "\n");
                    }

                    // 計算值配置
                    if (playerMove.equals("ATT")) {
                        System.out.println(player.Hit());
                    } else if (playerMove.equals("DEF")) {

                    }
                }

                // 敵方判定
                while (round == 2) {
                    System.out.println("輪到敵方");
                    system_combat bot = new system_combat();
                    bot.system_combat(Randomevent_area);
                    round = 1;
                }

                // 死亡判定
                if (player.HP <= 0) {
                    System.out.println("你死亡了!! " + "遊戲結束");
                    break;
                } else if (mob.HP <= 0) {
                    System.out.println("敵人已死 遊戲結束");
                    break;
                }
            }
        }
    }
}

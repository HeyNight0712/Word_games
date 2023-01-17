import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import mobs.mobs;
import npc.equip;
import npc.skill;

public class main {
    public static void main(String[] args) throws Exception {

        // 數值設定 (回合) / (玩家死亡)
        int round = 0;
        boolean player_survive = true;

        // 設置 物件
        equip equip = new equip();
        skill skill = new skill();
        events event = new events();
        mobs mobs = new mobs();
        create create = new create();
        // 初始化/玩家屬性

        // 讀取檔案 確保檔案是否遺失
        create.read();
        while ((boolean) player_survive == true) {
            // 開始遊戲 輸入
            System.out.println("\n" + "\n" + "點擊 ENTER 來開始遊戲");
            Scanner start_game_text = new Scanner(System.in);
            String start_game = start_game_text.nextLine();

            // 玩家死亡
            player_survive = false;

            // 死亡是否 重新 or 結束遊戲 輸入
            System.out.println("\n" + "\n" + "你已死亡" + "\n" + "輸入 Y 來重新開始");
            Scanner start_restart_text = new Scanner(System.in);
            String start_restart = start_game_text.nextLine();
            if (start_restart.equals("Y") || start_restart.equals("y")) {
                System.out.println("你選擇 重新開始遊戲");
                player_survive = true;
            } else {
                System.out.println("\n" + "遊戲結束");
            }
        }

        // 設置玩家名稱
        /*
         * while (player_survive) {
         * 
         * // 名稱判定
         * // 0 取名
         * // 1 確認
         * // 2 結束
         * while (round == 0 || round == 1) {
         * if (round == 0) {
         * player.your_name();
         * round = 1;
         * }
         * if (round == 1) {
         * // 確認
         * Scanner confirm_name1 = new Scanner(System.in);
         * System.out.println("確定名子取 " + player.name + " 嗎?" + "\n" + "[ y / n ]");
         * String confirm = confirm_name1.nextLine();
         * if (confirm.equals("y")) {
         * round = 2;
         * } else if (confirm.equals("n")) {
         * round = 0;
         * continue;
         * }
         * }
         * // 如果回傳 不是 [y / n]其中 則繞回去
         * }
         * System.out.println("\n" + "你的名子是 : " + player.name + "\n");
         * 
         * mob mob = new mob();
         * // 事件偵測
         * RD.info = 0;
         * RD.info_your();
         * while (RD.info == 0 || RD.info == 1 || RD.info == 2 || RD.info == 3) {
         * RD.info_your();
         * if (RD.info == 1) {
         * player.list();
         * TimeUnit.SECONDS.sleep(3);
         * } else if (RD.info == 2) {
         * 
         * } else if (RD.info == 3) {
         * player_survive = false;
         * RD.info = 1000;
         * }
         * }
         * // 結束遊戲
         * if (RD.HP <= 0) {
         * player_survive = false;
         * }
         * break;
         * }
         * 
         * // 個人事件
         * public void info_your() throws InterruptedException {
         * info = 0;
         * while (info == 0) {
         * info = 0;
         * String your_info = "0";
         * System.out.println("[ 1 ] " + "屬性");
         * System.out.println("[ 2 ] " + "移動");
         * System.out.println("[ 3 ] " + "結束遊戲");
         * Scanner info_use = new Scanner(System.in);
         * your_info = info_use.nextLine();
         * if (your_info.equals("1")) {
         * info = 1;
         * } else if (your_info.equals("2")) {
         * Search();
         * info = 2;
         * } else if (your_info.equals("3")) {
         * info = 3;
         * }
         * 
         * }
         * }
         * 
         * // 建立下方事件 的物件
         * player player = new player();
         * mob mob = new mob();
         * 
         * // 戰鬥 持續事件
         * public void harm() {
         * boolean harm_event = true;
         * while (harm_event) {
         * Scanner harm_your = new Scanner(System.in);
         * System.out.println("選擇 " + "{1} 攻擊" + "{2} 防禦");
         * String harm_use = harm_your.nextLine();
         * switch (harm_use) {
         * case "1":
         * player_dam();
         * break;
         * case "2":
         * break;
         * }
         * 
         * if (mob.HP <= 0) {
         * System.out.println("你贏了");
         * harm_event = false;
         * } else if (player.HP <= 0) {
         * System.out.println("你輸了" + player.HP);
         * HP = 0;
         * harm_event = false;
         * }
         * }
         * }
         * 
         * // 怪物事件
         * public void mob_dam() {
         * if (player.Defense >= mob.Damage) {
         * System.out.println("無效!");
         * } else {
         * Damage = player.HP - (mob.Damage - player.Defense);
         * player.HP = player.HP - (mob.Damage - player.Defense);
         * }
         * }
         * 
         * // 玩家事件
         * public void player_dam() {
         * if (mob.Defense >= player.Damage) {
         * System.out.println("無效!");
         * } else {
         * Damage = mob.HP - (player.Damage - mob.Defense);
         * mob.HP = mob.HP - (player.Damage - mob.Defense);
         * }
         * System.out.println("數值:");
         * System.out.println("「" + mob.LV + "」" + mob.name);
         * System.out.println("HP " + mob.HP + " / " + mob.HP_max);
         * }
         * // 營火 事件
         * // 商人事件
         * // 魔法 事件
         */
    }

}

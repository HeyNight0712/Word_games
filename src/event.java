import java.util.concurrent.TimeUnit;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class event {

    public String event_trigger;
    public String Random;
    String[] event_area = { "戰鬥", "營火", "武器商人", "魔法商人" };

    public int info;
    // 數值
    public int HP = 1;
    public int HP_max;

    public int MP;
    public int MP_max;

    public int Damage;
    public int hit;

    public int Defense;

    public int LV;
    public int EXP;
    public int EXP_max;

    public int Gold;

    // 隨機事件回傳
    public void confirm() {
        Random = event_area[new Random().nextInt(event_area.length)];
    }

    // 尋找事件
    // 機率 60%戰鬥 20%營火 10% 武器/技能
    public void Search() throws InterruptedException {
        String[] event_area = { "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "營火", "營火", "武器商人", "魔法商人" };
        Random = event_area[new Random().nextInt(event_area.length)];
        TimeUnit.SECONDS.sleep(1);
        System.out.println("移動中.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("移動中..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("移動中...");
        TimeUnit.SECONDS.sleep(1);
        confirm();
        System.out.println("事件發生 " + Random);
        event();
    }

    // 遇見甚麼事件 輸出出去
    public void event() {
        if (Random.equals("戰鬥")) {
            mob.mob();
            System.out.println("遇見 : " + mob.name + "似乎對你有敵意");
            mob.moblist();
            harm();
        } else if (Random.equals("營火")) {
            System.out.println("找到休息區域");

        } else if (Random.equals("武器商人")) {
            System.out.println("遇見武器商人");

        } else if (Random.equals("魔法導師")) {
            System.out.println("遇見魔法導師");

        }
    }

    // 個人事件
    public void info_your() throws InterruptedException {
        info = 0;
        while (info == 0) {
            info = 0;
            String your_info = "0";
            System.out.println("[ 1 ] " + "屬性");
            System.out.println("[ 2 ] " + "移動");
            System.out.println("[ 3 ] " + "結束遊戲");
            Scanner info_use = new Scanner(System.in);
            your_info = info_use.nextLine();
            if (your_info.equals("1")) {
                info = 1;
            } else if (your_info.equals("2")) {
                Search();
                info = 2;
            } else if (your_info.equals("3")) {
                info = 3;
            }

        }
    }

    // 建立下方事件 的物件
    player player = new player();
    mob mob = new mob();

    // 戰鬥 持續事件
    public void harm() {
        boolean harm_event = true;
        while (harm_event) {
            Scanner harm_your = new Scanner(System.in);
            System.out.println("選擇 " + "{1} 攻擊" + "{2} 防禦");
            String harm_use = harm_your.nextLine();
            switch (harm_use) {
                case "1":
                    player_dam();
                    break;
                case "2":
                    break;
            }

            if (mob.HP <= 0) {
                System.out.println("你贏了");
                harm_event = false;
            } else if (player.HP <= 0) {
                System.out.println("你輸了" + player.HP);
                HP = 0;
                harm_event = false;
            }
        }
    }

    // 怪物事件
    public void mob_dam() {
        if (player.Defense >= mob.Damage) {
            System.out.println("無效!");
        } else {
            Damage = player.HP - (mob.Damage - player.Defense);
            player.HP = player.HP - (mob.Damage - player.Defense);
        }
    }

    // 玩家事件
    public void player_dam() {
        if (mob.Defense >= player.Damage) {
            System.out.println("無效!");
        } else {
            Damage = mob.HP - (player.Damage - mob.Defense);
            mob.HP = mob.HP - (player.Damage - mob.Defense);
        }
        System.out.println("數值:");
        System.out.println("「" + mob.LV + "」" + mob.name);
        System.out.println("HP " + mob.HP + " / " + mob.HP_max);
    }
    // 營火 事件
    // 商人事件
    // 魔法 事件
}

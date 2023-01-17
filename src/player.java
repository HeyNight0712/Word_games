import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class player {
    // 實體 數值

    public String name = "None";

    public int HP;
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

    // 呼叫事件

    // 輸入名子
    // 玩家資訊
    public void list() {
        System.out.println(" 『 " + LV + " 』 " + name + " :");
        System.out.println("   血量 : " + HP + " / " + HP_max);
        System.out.println("   魔力 : " + HP + " / " + HP_max);
        System.out.println("   傷害 : " + Damage + " ( " + hit + " ) ");
        System.out.println("   防禦 : " + Defense);
        System.out.println();
        System.out.println("   經驗值 : " + EXP + " / " + EXP_max);
        System.out.println("   金幣 : " + Gold);
    }

    public void your_name() {
        Scanner your_name = new Scanner(System.in);
        System.out.println("請輸入你的名子");
        String player_name = your_name.nextLine();
        name = player_name;
    }

}

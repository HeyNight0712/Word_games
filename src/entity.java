import java.util.Scanner;

public class entity {
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

    // 怪物資訊
    public void moblist() {
        System.out.println(" 『 " + LV + " 』 " + name + " :");
        System.out.println("   血量 : " + HP + " / " + HP_max);
        System.out.println("   魔力 : " + HP + " / " + HP_max);
        System.out.println("   傷害 : " + Damage + " ( " + hit + " ) ");
        System.out.println("   防禦 : " + Defense);
        System.out.println();
        System.out.println("   經驗 : " + EXP);
        System.out.println("   金幣 : " + Gold);
    }

    // 遊戲內狀態
    public void pvp_list() {
        System.out.println(" 『 " + LV + " 』 " + name + " :");
    }

}

import java.util.Scanner;

public class aaentity {
    // 實體 數值

    public String name = "None";

    public static int HP;
    public static int HP_max;

    public static int MP;
    public static int MP_max;

    public static int Damage;
    public static int hit;

    public static int Defense;

    public static int LV;
    public static int EXP;
    public static int EXP_max;

    public static int Gold;

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

    mob mob = new mob();

    public void mob() {
        name = mob.name;
        LV = mob.LV;
        HP = mob.HP;
        HP_max = mob.HP_max;
        MP = mob.MP;
        MP_max = mob.MP_max;
        Damage = mob.Damage;
        hit = mob.hit;
        Defense = mob.Defense;
        EXP = mob.EXP;
        Gold = mob.Gold;
    }

}

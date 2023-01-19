package data;

//玩家數值
public class player {
    public static String name = "None";

    public static int HP;
    public static int HP_max;

    public static int MP;
    public static int MP_max;

    public static int Damage;
    public static int Hit;

    public static int Defense;

    public static int LV;
    public static int EXP;
    public static int EXP_max;

    public static int Gold;

    static String info_system = "【後台】 ";

    public void restart() {
        System.out.println(info_system + "- 初始化 玩家屬性");
        name = "None";
        HP = 20;
        HP_max = HP;
        MP = 5;
        MP = MP_max;
        Damage = 3;
        Hit = 0;
        Defense = 1;
        LV = 0;
        EXP = 0;
        EXP_max = 25;
        Gold = 0;
    }

    // 屬性輸出
    public void info() {
        System.out.println(name + ":");
        System.out.println("----------");
        System.out.println("HP - " + HP + " / " + HP_max);
        System.out.println("MP - " + MP + " / " + MP_max);
        System.out.println("Dam - " + Damage + " (" + Hit + ")");
        System.out.println("Def - " + Defense);
        System.out.println("----------");
    }
}

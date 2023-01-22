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

    public static void restart() {
        System.out.println(text.info_system + "- 初始化 玩家屬性");
        name = "None";
        HP = 20;
        HP_max = HP;
        MP = 5;
        MP = MP_max;
        Damage = 5;
        Hit = 1;
        Defense = 1;
        LV = 0;
        EXP = 0;
        EXP_max = 25;
        Gold = 0;
    }

    // 屬性輸出
    public static void info() {
        System.out.println("\n" + name + ":");
        System.out.println("----------");
        System.out.println(lang.HP + " - " + HP + " / " + HP_max);
        System.out.println(lang.MP + " - " + MP + " / " + MP_max);
        System.out.println(lang.Damage + " - " + Damage + " (" + Hit + ")");
        System.out.println(lang.Defense + " - " + Defense);
        System.out.println("----------");
    }
}

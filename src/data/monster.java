package data;

//敵方數值
public class monster {
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
    public static int Gold;

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
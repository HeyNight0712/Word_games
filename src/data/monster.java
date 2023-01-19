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
    public void info() {
        System.out.println("\n" + name + ":");
        System.out.println("----------");
        System.out.println("HP - " + HP + " / " + HP_max);
        System.out.println("MP - " + MP + " / " + MP_max);
        System.out.println("Dam - " + Damage + " (" + Hit + ")");
        System.out.println("Def - " + Defense);
        System.out.println("----------");
    }
}
import java.util.Random;

public class mobs {
    public float HP;
    public float HP_max = HP;
    public float DAM;
    public float DEF;
    public String[] chance = { "1", "1", "0.8", "1.2", "0" };

    public float C_HIT;

    public String Hit() {
        String Hit = chance[new Random().nextInt(chance.length)];
        if (Hit.equals("1")) {
            System.out.println("命中成功 造成 " + DAM + " 點傷害");
            C_HIT = DAM;
        } else if (Hit.equals("0.8")) {
            System.out.println("命中成功 但只有擦傷 造成 " + (DAM * 0.8) + " 點傷害");
            C_HIT = DAM * 0.8f;
        } else if (Hit.equals("1.2")) {
            System.out.println("命中要害 造成 " + (DAM * 1.2) + " 點傷害");
            C_HIT = DAM * 1.2f;
        } else {
            System.out.println("未命中");
            C_HIT = 0;
        }
        return Hit;
    }
}

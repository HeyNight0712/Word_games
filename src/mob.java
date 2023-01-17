public class mob {
    // 生物設置

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

    public int mobRandom;

    // 隨機怪物
    public void mob() {
        mobRandom = (int) ((float) Math.random() * 10);

        switch (mobRandom) {
            case 0:
                a1();
                break;
            case 1:
                a1();
                break;
            case 2:
                a2();
                break;
            case 3:
                a3();
                break;
            case 4:
                a4();
                break;
            case 5:
                a5();
                break;
            case 6:
                a6();
                break;
            case 7:
                a7();
                break;
            case 8:
                a8();
                break;
            case 9:
                a9();
                break;
            case 10:
                a10();
                break;
        }
    }

    // 生物資訊
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

    public void a1() {
        name = "殭屍";
        LV = 1;
        HP = 20;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 1;
        hit = 0;
        Defense = 0;
        EXP = 10;
        Gold = 3;
    }

    public void a2() {
        name = "史萊姆";
        LV = 1;
        HP = 10;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 1;
        hit = 0;
        Defense = 0;
        EXP = 4;
        Gold = 1;
    }

    public void a3() {
        name = "骷髏";
        LV = 1;
        HP = 15;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 7;
        Gold = 2;
    }

    public void a4() {
        name = "精靈";
        LV = 1;
        HP = 7;
        HP_max = HP;
        MP = 20;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 10;
        Gold = 2;
    }

    public void a5() {
        name = "海妖";
        LV = 1;
        HP = 15;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 7;
        Gold = 2;
    }

    public void a6() {
        name = "坦克";
        LV = 1;
        HP = 15;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 7;
        Gold = 2;
    }

    public void a7() {
        name = "刺客";
        LV = 1;
        HP = 15;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 7;
        Gold = 2;
    }

    public void a8() {
        name = "騎士";
        LV = 1;
        HP = 15;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 7;
        Gold = 2;
    }

    public void a9() {
        name = "獵人";
        LV = 1;
        HP = 15;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 7;
        Gold = 2;
    }

    public void a10() {
        name = "小天";
        LV = 1;
        HP = 15;
        HP_max = HP;
        MP = 0;
        MP_max = MP;
        Damage = 2;
        hit = 0;
        Defense = 0;
        EXP = 7;
        Gold = 2;
    }
}

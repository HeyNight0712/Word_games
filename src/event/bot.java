package event;

import java.util.Random;

import data.lang;
import data.monster;

public class bot {
    attack attack = new attack();
    static int bot_use;

    public void probability() throws Exception {
        Random rand = new Random();
        bot_use = rand.nextInt(100);
        if (0 <= bot_use && 59 >= bot_use) {
            System.out.println(monster.name + " 使出了" + lang.attack);
            attack.ATT();
        } else if (60 >= bot_use && 89 <= bot_use) {
            System.out.println(monster.name + " 使出了" + lang.Attributes);
        } else {
            System.out.println(monster.name + " 使出了" + lang.skill);
        }
    }
}

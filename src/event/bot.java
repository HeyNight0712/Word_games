package event;

import java.util.Random;

import data.monster;

public class bot {

    static int bot_use;

    public void probability() {
        Random rand = new Random();
        bot_use = rand.nextInt(100);
        if (0 <= bot_use && 59 >= bot_use) {
            System.out.println(monster.name + " 使出了攻擊");
        } else if (60 >= bot_use && 89 <= bot_use) {
            System.out.println(monster.name + " 使出了防禦");
        } else {
            System.out.println(monster.name + " 使出了技能");
        }
    }
}

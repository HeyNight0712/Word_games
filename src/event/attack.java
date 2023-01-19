package event;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import data.lang;
import data.monster;
import data.player;
import data.system_value;

public class attack {

    // 先隨機 傷害數值
    public void ATT() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        Random Dam_rand = new Random();
        int Dam;
        int Hit;
        switch (system_value.round) {
            case 0:
                Dam = Dam_rand.nextInt(player.Damage);
                Hit = player.Hit;
                // 如果 玩家 Hit + Dam數值 > Dam 時 則 傷害輸出 = player.Damage
                if (Hit + Dam >= player.Damage) {
                    Dam = player.Damage;
                    System.out.println("\n" + "造成 " + Dam + " 傷害");
                    monster.HP = monster.HP - Dam;
                } else {
                    System.out.println("\n" + "造成 " + Dam + " 傷害");
                    monster.HP = monster.HP - (Dam + Hit);
                }
                System.out
                        .println(monster.name + " " + lang.HP + " " + monster.HP + " / " + monster.HP_max + " -" + Dam);
                break;
            case 1:
                Dam = Dam_rand.nextInt(monster.Damage);
                Hit = monster.Hit;
                // 如果 玩家 Hit + Dam數值 > Dam 時 則 傷害輸出 = monster.Damage
                if (Hit + Dam >= monster.Damage) {
                    Dam = monster.Damage;
                    player.HP = player.HP - Dam;
                } else {
                    player.HP = player.HP - -(Dam + Hit);
                }
                System.out.println(player.name + " " + lang.HP + " " + player.HP + " / " + player.HP_max + " -" + Dam);
                break;
        }
    }
}

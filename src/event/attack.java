package event;

import java.util.Random;

import data.monster;
import data.player;
import data.system_value;

public class attack {

    // 先隨機 傷害數值
    public void ATT() throws Exception {
        Random Dam_rand = new Random();
        int Dam = Dam_rand.nextInt(player.Damage);
        int Hit = player.Hit;
        // 如果 玩家 Hit + Dam數值 > Dam 時 則 傷害輸出 = player.Damage
        if (Hit + Dam >= player.Damage) {
            Dam = player.Damage;
            System.out.println("\n" + "造成 " + Dam + " 傷害");
            monster.HP = monster.HP - Dam;
            System.out.println(monster.name + " HP " + monster.HP + " / " + monster.HP_max);
        } else {
            System.out.println("\n" + "造成 " + Dam + " 傷害");
            monster.HP = monster.HP - Dam;
            System.out.println(monster.name + " HP " + monster.HP + " / " + monster.HP_max);
        }
    }
}

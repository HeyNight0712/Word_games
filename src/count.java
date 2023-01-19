
import java.util.concurrent.TimeUnit;

import data.lang;
import data.monster;
import data.player;

//計算狀態
public class count {
    // 匯入計算
    monster mob = new monster();
    player player = new player();

    public void EXP() throws Exception {
        player.EXP = monster.EXP + player.EXP;
        player.Gold = monster.Gold + player.Gold;
        System.out.println("\n" + "成功擊殺 " + monster.name + " + EXP " + monster.EXP + " + GOLD " + monster.Gold);
        TimeUnit.SECONDS.sleep(1);
        if (player.EXP >= player.EXP_max) {
            player.EXP = 0;
            player.LV++;
            System.out.println("等級提升" + (player.LV - 1) + " 至 " + player.LV);
        }
        System.out.println(
                "『" + player.LV + "』" + player.name + ": " + " " + lang.EXP + " " + player.EXP + " / " + player.EXP_max
                        + " " + lang.GOLD + " " + player.Gold + "\n");
    }
}

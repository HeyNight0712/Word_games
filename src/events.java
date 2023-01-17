import java.util.Random;
import java.util.concurrent.TimeUnit;

import npc.equip;
import npc.skill;

public class events {
    // 資訊
    static String info_system = "【系統】 ";
    // 敘述
    static String info_move = "移動中";
    static equip equip = new equip();
    static skill skill = new skill();

    String Random;

    // 尋找事件
    // 機率 60%戰鬥 20%營火 10% 武器/技能
    public void Search() throws Exception {
        String[] event_area = { "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "戰鬥", "營火", "營火", "營火", "武器商人",
                "武器商人",
                "魔法商人" };
        Random = event_area[new Random().nextInt(event_area.length)];
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + info_move + ".");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + info_move + "..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + info_move + "...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(info_system + "事件發生 " + Random);
        event();
    }

    // 尋找事件 回應
    public void event() throws Exception {
        if (Random.equals("戰鬥")) {

            System.out.println(info_system + "遇見 : " + "似乎對你有敵意");

        } else if (Random.equals("營火")) {
            System.out.println(info_system + "找到休息區域");

        } else if (Random.equals("武器商人")) {
            System.out.println(info_system + "遇見武器商人");
            equip.random_npc();
        } else if (Random.equals("魔法導師")) {
            System.out.println(info_system + "遇見魔法導師");
            skill.random_npc();

        }
    }
}

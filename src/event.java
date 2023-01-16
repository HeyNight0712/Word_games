import java.util.concurrent.TimeUnit;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class event {

    public String event_trigger;
    public String Random;
    String[] event_area = { "戰鬥", "營火", "武器商人", "魔法商人" };

    public int info;

    // 尋找事件
    public void Search() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("移動中.");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("移動中..");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("移動中...");
        TimeUnit.SECONDS.sleep(1);
        confirm();
        System.out.println("事件發生 " + Random);
        event();
    }

    // 隨機事件回傳
    public void confirm() {
        Random = event_area[new Random().nextInt(event_area.length)];
    }

    // 遇見甚麼事件 回傳 Search()
    public void event() {
        if (Random.equals("戰鬥")) {
            System.out.println("遇見" + "測試玩家");

        } else if (Random.equals("營火")) {
            System.out.println("找到休息區域");

        } else if (Random.equals("武器商人")) {
            System.out.println("遇見武器商人");

        } else if (Random.equals("魔法導師")) {
            System.out.println("遇見魔法導師");

        }
    }

    // 個人事件
    public void info_your() throws InterruptedException {
        while (true) {
            info = 0;
            System.out.println("[ 1 ] " + "屬性");
            System.out.println("[ 2 ] " + "移動");
            System.out.println("[ 3 ] " + "結束遊戲");
            Scanner info_use = new Scanner(System.in);
            info = info_use.nextInt();
        }
    }
}

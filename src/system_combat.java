import java.util.Random;

public class system_combat {
    public void system_combat(String Randomevent_area) {
        String[] event_area = { "ATT", "DEF" };
        Randomevent_area = event_area[new Random().nextInt(event_area.length)];

        System.out.println("對方選擇: " + Randomevent_area);
        if (Randomevent_area.equals("ATT")) {
        } else if (Randomevent_area.equals("DEF")) {
        } else {
        }
    }
}

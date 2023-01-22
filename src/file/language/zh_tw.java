package file.language;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
import com.google.gson.JsonObject;

public class zh_tw {

    public static void create_file() throws Exception {
        File equipJson = new File("lang/zh_tw.json");
        if (!equipJson.exists()) {
            // 寫入 檔案數據
            JsonObject obj = new JsonObject();
            JsonObject zh_tw = new JsonObject();
            zh_tw.addProperty("HP", "HP");
            zh_tw.addProperty("MP", "MP");
            zh_tw.addProperty("EXP", "EXP");
            zh_tw.addProperty("GOLD", "GOLD");
            zh_tw.addProperty("Dam", "Dam");
            zh_tw.addProperty("Def", "Def");
            zh_tw.addProperty("move", "移動");
            zh_tw.addProperty("item", "道具");
            zh_tw.addProperty("attack", "攻擊");
            zh_tw.addProperty("skill", "技能");
            zh_tw.addProperty("Attributes", "屬性");
            zh_tw.addProperty("defense", "防禦");
            obj.add("zh_tw", zh_tw);
            // 結束

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonData = gson.toJson(obj);
            // 寫入 文件
            FileWriter writer = new FileWriter(equipJson);
            writer.write(jsonData);
            writer.close();
            System.out.println(data.text.info_system + "- 寫入 zh_tw");
        } else {
            System.out.println(data.text.info_system + "- 讀取 zh_tw");
        }
    }
}

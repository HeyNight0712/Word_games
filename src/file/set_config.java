package file;

import java.io.File;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class set_config {

    public static void read_file() throws Exception {
        File configFile = new File("config/config.json");
        if (!configFile.exists()) {
            create_file();
            System.out.println(data.text.info_system + "- 寫入 設定黨");
        } else {
            System.out.println(data.text.info_system + "- 讀取 設定檔");
        }
    }

    // 寫入 檔案
    public static void create_file() throws Exception {
        File configFile = new File("config/config.json");
        JsonObject obj = new JsonObject();
        obj.addProperty("Version", "bata-v0.0.1");
        obj.addProperty("file_update", true);
        obj.addProperty("language", "zh_tw");
        // 結束

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonData = gson.toJson(obj);
        // 寫入 文件
        FileWriter writer = new FileWriter(configFile);
        writer.write(jsonData);
        writer.close();
    }
}

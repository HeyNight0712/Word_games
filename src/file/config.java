package file;

import java.io.File;

public class config {
    // 寫入 config 資料夾
    public static void config_folder() throws Exception {
        File configDir = new File("config");
        if (!configDir.exists()) {
            configDir.mkdir();
            System.out.println(data.text.info_system + "- 寫入 config");
        } else {
            System.out.println(data.text.info_system + "- 讀取 config");
        }
    }
}

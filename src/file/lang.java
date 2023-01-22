package file;

import java.io.File;

public class lang {
    public static void lang_folder() {
        File configDir = new File("lang");
        if (!configDir.exists()) {
            configDir.mkdir();
            System.out.println(data.text.info_system + "- 寫入 lang");
        } else {
            System.out.println(data.text.info_system + "- 讀取 lang");
        }
    }
}

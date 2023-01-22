package discord;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class start {

    public static void main(String[] args) throws Exception {
        start start = new start();
        start.prepareJDA();
    }

    public JDA prepareJDA() throws LoginException {

        // 機器人上線
        try {
            JDA jda = JDABuilder.createDefault(discord.data.data.token)
                    .addEventListeners()
                    .build()
                    .awaitReady();
            return jda;
        } catch (InterruptedException e) {
            System.out.println("機器人上線");
            System.exit(-1);
        }
        return null;
    }
}

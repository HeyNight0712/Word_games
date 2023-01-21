package discord;

import discord.event.name;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class start {
    // 機器人代碼
    static String token = "MTA2MzY0NjU3NzMxMjM5OTQ0Mw.GGeMeC.Sx8C7ZVoPcfyv31PTT1MkQ--OXFn54MLNOda3g";

    public static void main(String[] args) throws Exception {
        // 機器人上線
        JDA jda = JDABuilder.createDefault(discord.data.data.token).build();

        jda.addEventListener(new name());

        jda.awaitReady();
    }
}

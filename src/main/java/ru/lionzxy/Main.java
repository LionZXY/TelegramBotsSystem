package ru.lionzxy;


import org.telegram.telegrambots.TelegramBotsApi;
import ru.lionzxy.utils.CrashFileHelper;


public class Main {

    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi("server.jks", BotConfig.KEY_PASSWORD , "https://telegram.lionzxy.ru:443/", "https://telegram.lionzxy.ru:443/","YOURPEM.pem","YOURPEM.pem");
            telegramBotsApi.registerBot(new YaMobilization());
        } catch (Exception e) {
            new CrashFileHelper(e);
        }
    }
}

package ru.lionzxy;


import org.telegram.telegrambots.TelegramBotsApi;
import ru.lionzxy.utils.CrashFileHelper;


public class Main {

    public static void main(String[] args) {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi("cert.pem", "159357za", "https://telegram.lionzxy.ru:8443", "https://telegram.lionzxy.ru:8443");
            telegramBotsApi.registerBot(new YaMobilization());
        } catch (Exception e) {
            new CrashFileHelper(e);
        }
    }
}

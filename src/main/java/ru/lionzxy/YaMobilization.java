package ru.lionzxy;

import org.telegram.telegrambots.api.methods.BotApiMethod;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramWebhookBot;

/**
 * Created by Никита on 20.05.2016.
 */
public class YaMobilization extends TelegramWebhookBot {
    @Override
    public BotApiMethod onWebhookUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        return null;
    }

    @Override
    public String getBotUsername() {
        return "YaMobilizationBot";
    }

    @Override
    public String getBotToken() {
        return BotConfig.TOKEN;
    }

    @Override
    public String getBotPath() {
        return "";
    }
}

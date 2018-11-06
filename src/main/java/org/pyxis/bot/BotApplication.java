package org.pyxis.bot;

import lombok.extern.slf4j.Slf4j;
import org.pyxis.bot.payload.Bot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Slf4j
public class BotApplication {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi api = new TelegramBotsApi();
        try {
            api.registerBot(new Bot());
        }
        catch (TelegramApiException e){
        log.error("TelegramApi failed to register new Bot", e.getMessage());
        }
    }
}

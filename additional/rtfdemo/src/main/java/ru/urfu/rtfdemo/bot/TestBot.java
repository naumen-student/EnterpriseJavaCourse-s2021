package ru.urfu.rtfdemo.bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.urfu.rtfdemo.dao.FDao;


@Component
public class TestBot extends TelegramLongPollingBot {
    @Value("${telegram.bot.token}")
    private String token;

    @Override
    public String getBotUsername() {
        return "rtfBot";
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message msg = update.getMessage();
        String text = msg.getText();
        Long chatId = msg.getChatId();

        if (text == null) {
            text = "";
        } else {
            FDao.add(text);
        }


        SendMessage sMsg = new SendMessage();
        sMsg.setChatId(chatId.toString());

        sMsg.setText(text + " Hey!");

        try {
            execute(sMsg);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

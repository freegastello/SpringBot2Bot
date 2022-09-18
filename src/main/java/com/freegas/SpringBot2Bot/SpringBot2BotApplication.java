package com.freegas.SpringBot2Bot;

import com.freegas.SpringBot2Bot.settings.CommandsBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class SpringBot2BotApplication {

	public static void main(String[] args) throws TelegramApiException {
		SpringApplication.run(SpringBot2BotApplication.class, args);
		CommandsBot commandsBot = new CommandsBot();
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
		telegramBotsApi.registerBot(commandsBot);
	}
}

package ch.pokino.game;

import ch.pokino.game.messaging.RabbitMQConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@Import(RabbitMQConfiguration.class)
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

}
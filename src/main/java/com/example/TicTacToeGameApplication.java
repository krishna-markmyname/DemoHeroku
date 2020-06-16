package com.example;

import com.example.domain.Player;
import com.example.repository.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class TicTacToeGameApplication {


	public static void main(String[] args) {

		SpringApplication.run(TicTacToeGameApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(PlayerRepository playerRepository) {
        return (args) -> {

            //save a couple of players
            playerRepository.save(new Player("manas", "manasm@sidgs.com", new BCryptPasswordEncoder().encode("manas")));
            playerRepository.save(new Player("krishna", "krishna@sidgs.com",  new BCryptPasswordEncoder().encode("krishna")));

        };
    }

}

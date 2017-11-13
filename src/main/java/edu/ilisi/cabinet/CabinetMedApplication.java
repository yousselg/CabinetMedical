package edu.ilisi.cabinet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Clock;

@SpringBootApplication
public class CabinetMedApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabinetMedApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(){
		return new CommandLineRunner(){
			@Override
			public void run(String... strings) throws Exception{

			}
		};
	}
}

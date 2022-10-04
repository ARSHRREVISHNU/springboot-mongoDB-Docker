package com.example.spingbootmongodbdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class SpingbootMongodbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootMongodbDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {
			Address address = new Address(
					"India",
					"Chennai",
					"600012"

			);
			Student student = new Student(
					"Shrrevishnu",
					"A R",
					"sh@gmai.com",
					Gender.MALE,
					address,
					List.of("Maths", "CS", "Eng"),
					BigDecimal.TEN
					//ZonedDateTime.now()

			);

			repository.insert(student);
		};
	}

}

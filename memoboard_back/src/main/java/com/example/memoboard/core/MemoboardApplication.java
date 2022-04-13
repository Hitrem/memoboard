package com.example.memoboard.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.memoboard")
@EnableJpaRepositories("com.example.memoboard.repository")
@EntityScan("com.example.memoboard.model")
public class MemoboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoboardApplication.class, args);
	}

}

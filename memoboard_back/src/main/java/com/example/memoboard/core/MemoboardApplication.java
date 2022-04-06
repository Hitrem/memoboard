package com.example.memoboard.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("com.example.memoboard")
public class MemoboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoboardApplication.class, args);
	}

}

package com.lessons.qualifierannotationtjd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QualifierAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierAnnotationApplication.class, args);
	}

	@Bean("WORD")
	public WordFileReader getWordFileReader() {
		return new WordFileReader();
	}
}

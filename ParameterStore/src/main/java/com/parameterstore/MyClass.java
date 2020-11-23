package com.parameterstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

	@Value("${amazon.dynamodb.endpoint}")
	private String message;
	
	@Bean
	public void getString() {
		System.out.println(message);
	}
}

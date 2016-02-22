package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author Stephane Nicoll
 */
@Configuration
public class MyConfiguration {

	@Autowired(required = false)
	@Lazy
	private MyService myService;

	@Bean
	public String bean() {
		if (myService != null) {
			return myService.toString();
		}
		return "not available";
	}

}

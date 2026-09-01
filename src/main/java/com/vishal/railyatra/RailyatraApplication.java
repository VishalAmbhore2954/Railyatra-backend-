package com.vishal.railyatra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RailyatraApplication {

	public static void main(String[] args) {
		System.out.println("App Started");
		SpringApplication.run(RailyatraApplication.class, args);
		System.out.println("finished");
	}

}

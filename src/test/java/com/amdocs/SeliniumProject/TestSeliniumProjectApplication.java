package com.amdocs.SeliniumProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSeliniumProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(SeliniumProjectApplication::main).with(TestSeliniumProjectApplication.class).run(args);
	}

}

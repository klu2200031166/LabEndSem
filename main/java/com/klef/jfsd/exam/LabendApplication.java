package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.jfsd.exam")

public class LabendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabendApplication.class, args);
	}

}

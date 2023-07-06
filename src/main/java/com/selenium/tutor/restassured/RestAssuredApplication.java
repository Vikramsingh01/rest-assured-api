package com.selenium.tutor.restassured;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(name = "basicAuth", scheme = "basic", type = SecuritySchemeType.HTTP)
public class RestAssuredApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAssuredApplication.class, args);
	}

}

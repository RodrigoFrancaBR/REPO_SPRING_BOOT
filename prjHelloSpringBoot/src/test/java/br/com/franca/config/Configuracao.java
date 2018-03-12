package br.com.franca.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Configuracao {
	@RequestMapping("/")
	@ResponseBody
	String ola() {
		// return "Hello World Spring Boot !";
		return "<h1>Hello World Spring Boot! </h1>" + "<p> Com HTML.class </p>";

	}

	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

}

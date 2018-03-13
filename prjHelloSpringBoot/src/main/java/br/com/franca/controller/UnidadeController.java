package br.com.franca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UnidadeController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/listarunidades")
	public String listarUnidades(){
		return "listadeunidades";
	}
	
}

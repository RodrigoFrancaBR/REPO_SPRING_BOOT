package br.com.franca.prjSpringBoot.controller;

import static java.util.Arrays.asList;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.franca.prjSpringBoot.model.Unidade;

@RestController
@RequestMapping("unidade")
public class UnidadeController {

	@GetMapping
	public List<Unidade> listAll() {
		return asList(new Unidade(new Long(1), "Cascadura", "Avenida Dom Helder Camara 5555"),
				new Unidade(new Long(2), "Meier", "Rua Ana Barbosa 34"));
	}

}

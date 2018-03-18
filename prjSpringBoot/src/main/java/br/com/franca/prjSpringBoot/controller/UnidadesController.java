package br.com.franca.prjSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.franca.prjSpringBoot.model.Unidade;
import br.com.franca.prjSpringBoot.repository.Unidades;

@Controller
public class UnidadesController {

	@Autowired
	private Unidades unidades;

	@GetMapping("/unidades")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaUnidades");
		modelAndView.addObject("unidades", unidades.findAll());
		modelAndView.addObject(new Unidade());
		return modelAndView;
	}
	
	
	
	@PostMapping("/cadastrar")
	public String salvar(Unidade unidade) {
		this.unidades.save(unidade);				
		return "redirect:/unidades";
	}
	
	
	@GetMapping("/listando")
	public ModelAndView listando() {
		ModelAndView xuxu = new ModelAndView("index");
		return xuxu;
	}
	
	//@RequestMapping("/")
	@GetMapping("/")
	public String index(){
		return "index";
	}
}

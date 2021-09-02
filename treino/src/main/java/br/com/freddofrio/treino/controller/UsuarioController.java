package br.com.freddofrio.treino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.freddofrio.treino.entity.Usuario;
import br.com.freddofrio.treino.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired // Toda vez que for preciso utilizar a interface Repository, será feito a injeção, criando uma nova instância automaticamente
	private UsuarioRepository repository;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView();
		
		view.addObject("usuarios", repository.findAll());
		view.setViewName("/cadastro");
		
		return view;
	}
	
	@PostMapping("/save")
	public String cadastro(Usuario usuario) {
		repository.save(usuario);
		return "redirect:/";
	}

}

package com.telacadastro.telacad.controller;

import com.telacadastro.telacad.entity.Dados;
import com.telacadastro.telacad.repository.DadosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DadosController {
    @Autowired
    private DadosRepository dr;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/salvar")
    public String salvar(Dados dados){
        dr.save(dados);
        return "redirect:/";
    }
}

package com.telacadastro.telacad.repository;

import com.telacadastro.telacad.entity.Dados;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosRepository extends JpaRepository<Dados,Long>{
    
}

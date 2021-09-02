package br.com.freddofrio.treino.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.freddofrio.treino.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

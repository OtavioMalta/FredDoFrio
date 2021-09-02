package br.com.freddofrio.treino.entity;

import javax.persistence.*;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity 
@Table(name = "usuarios")
public class Usuario extends AbstractPersistable<Long> { // gera automaticamente um id do tipo long 

	@Column
	private String nome;
	@Column 
	private String senha;
	
	@Override
	public void setId(Long id) {
		super.setId(id);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

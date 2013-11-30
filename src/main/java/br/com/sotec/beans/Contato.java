package br.com.sotec.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("contato")
@Scope("prototype")
public class Contato {

	private String nome;
	private Long telefone;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

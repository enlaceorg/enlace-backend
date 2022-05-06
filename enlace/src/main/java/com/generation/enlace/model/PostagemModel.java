package com.generation.enlace.model;

<<<<<<< HEAD
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "postagem")
public class PostagemModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long postagem_id;
	
	@NotNull
	public String conteudo;
	
	
	public int abracei;
	
	@NotNull
	@CreatedDate
	@Column(name = "criado_em")
	public Instant criadoEm = Instant.now();
	
	@NotNull
	@CreatedDate
	@Column(name = "atualizado_em")
	public Instant atualizadoEm = Instant.now();
	
	//GET e Set

	public long getPostagem_id() {
		return postagem_id;
	}

	public void setPostagem_id(long postagem_id) {
		this.postagem_id = postagem_id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getAbracei() {
		return abracei;
	}

	public void setAbracei(int abracei) {
		this.abracei = abracei;
	}

	public Instant getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Instant criadoEm) {
		this.criadoEm = criadoEm;
	}

	public Instant getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Instant atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}
	
=======
public class PostagemModel {
>>>>>>> 24ceb86306081ca5edcaa921e638b690804f4cc1

}

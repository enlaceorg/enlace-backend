package com.generation.enlace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="temas")
public class TemaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tema_id")
	private Long temaId;
	
	@NotNull
	private String descricao;
	
	@NotNull
	@Size(min=3,max=20)
	private String tag;
	
	
	//Get Set

	public Long getId() {
		return temaId;
	}

	public void setId(Long id) {
		this.temaId = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	
	
	

	
	
	
}

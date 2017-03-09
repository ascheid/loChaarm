package br.com.scheid.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria extends AbstractModel<Long> implements Serializable{

	private static final long serialVersionUID = -1872692834593120636L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String descricao;
	
	@Override
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

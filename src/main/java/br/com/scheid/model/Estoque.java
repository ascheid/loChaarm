package br.com.scheid.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estoque extends AbstractModel<Long> implements Serializable{

	private static final long serialVersionUID = -969836940459666959L;
	
	@Id
	@GeneratedValue
	private Long id;
	private Long p;
	private Long m;
	private Long g;
	private Long gg;
	
	@Override
	public Long getId() {
		return this.id;
	}

	public Long getP() {
		return p;
	}

	public void setP(Long p) {
		this.p = p;
	}

	public Long getM() {
		return m;
	}

	public void setM(Long m) {
		this.m = m;
	}

	public Long getG() {
		return g;
	}

	public void setG(Long g) {
		this.g = g;
	}

	public Long getGg() {
		return gg;
	}

	public void setGg(Long gg) {
		this.gg = gg;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

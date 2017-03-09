package br.com.scheid.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Item extends AbstractModel<Long> implements Serializable{
	
	private static final long serialVersionUID = -5734327638063230910L;
	
	@Id
	@GeneratedValue
	private Long id;
	private BigDecimal preco;
	private String descricao;
	private Boolean ativo;
	private Boolean telaInicial;
	@ManyToOne
	private Categoria categoria;
	@ManyToOne
	private SubCategoria subCategoria;
	@OneToOne
	private Estoque estoque;
	
	@Override
	public Long getId() {
		return this.id;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Boolean getTelaInicial() {
		return telaInicial;
	}

	public void setTelaInicial(Boolean telaInicial) {
		this.telaInicial = telaInicial;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public SubCategoria getSubCategoria() {
		return subCategoria;
	}

	public void setSubCategoria(SubCategoria subCategoria) {
		this.subCategoria = subCategoria;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

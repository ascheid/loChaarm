package br.com.scheid.model;

import java.io.Serializable; 
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
public class Carrinho extends AbstractModel<Long> implements Serializable {

	private static final long serialVersionUID = -6200489437873239126L;
	
	@Id
	@GeneratedValue
	private Long id;
	private BigDecimal total;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPedido;
	private BigDecimal frete;
	private String token;
	@ManyToOne
	private Usuario usuario;
	@OneToMany
	private List<Item> produtos;
	
	@Override
	public Long getId() {
		return this.id;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Item> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Item> produtos) {
		this.produtos = produtos;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

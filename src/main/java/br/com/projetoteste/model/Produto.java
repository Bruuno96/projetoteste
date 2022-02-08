package br.com.projetoteste.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_PRODUTO")
@SequenceGenerator(allocationSize = 1, name = "produto", sequenceName = "sq_produto")
public class Produto {

	@Id
	@GeneratedValue(generator = "produto", strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long id;

	@Column(name = "nm_nome")
	private String nome;

	@Column(name = "qts_quantidade")
	private Long quantidade;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_dataValidade")
	private Calendar dataValidade;

	@Column(name = "nr_setor")
	private int setor;

	@Column(name = "ds_marca")
	private String marca;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "mercado_id")
	private Mercado mercado;

	
	public Produto() {}
	
	public Produto(String nome, Long quantidade, Marca marca, Calendar dataValidade, Setor setor) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.marca = marca.getDescription();
		this.dataValidade = dataValidade;
		this.setor = setor.getCode();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	public Calendar getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
	
	
}

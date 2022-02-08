package br.com.projetoteste.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MERCADO")
@SequenceGenerator(allocationSize = 1, name = "mercado", sequenceName = "sq_mercado")
public class Mercado {

	@Id
	@GeneratedValue(generator = "mercado", strategy = GenerationType.IDENTITY)
	@Column(name = "id_mercado")
	private Long id;

	@Column(name ="nm_nome")
	private String nome;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "endereco_id")
	private Endereco endereco;
	
	@OneToOne
	@JoinColumn(name = "gerente_id")
	private Gerente gerente;
	
	@OneToMany(mappedBy = "mercado")
	private List<Produto> produtos;
	
	public Mercado() {}


	public Mercado(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
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


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
}

package br.com.projetoteste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ENDERECO")
@SequenceGenerator(allocationSize = 1, name = "endereco", sequenceName = "sq_endereco")
public class Endereco {

	@Id
	@GeneratedValue(generator = "endereco", strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Long id;

	@Column(name = "ds_rua")
	private String rua;

	@Column(name = "nr_numero")
	private int numero;
	
	@Column(name = "ds_cidade")
	private String cidade;
	
	@OneToOne(mappedBy = "endereco")
	private Pessoa pessoa;
	
	@OneToOne(mappedBy = "endereco")
	private Mercado mercado;
	
	public Endereco() {}

	public Endereco(String rua, int numero, String cidade) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	
	
}

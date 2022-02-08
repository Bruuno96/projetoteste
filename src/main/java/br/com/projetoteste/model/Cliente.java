package br.com.projetoteste.model;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@PrimaryKeyJoinColumn(name = "id_cliente")
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente extends Pessoa {

	
    @Column(name = "dt_data_compra")
    @Temporal(TemporalType.DATE)
	private Calendar dataCompra;

    @OneToMany(mappedBy = "cliente")
    private Set<Produto> produtos;
	
	
	public Cliente() {}

	public Cliente(String nome, Calendar dataNascimento, String telefone, Endereco endereco) {
		super(nome, dataNascimento, telefone, endereco);
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}

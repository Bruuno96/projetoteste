package br.com.projetoteste.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@PrimaryKeyJoinColumn(name = "id_gerente")
@Entity
@Table(name = "TB_GERENTE")
public class Gerente extends Pessoa{

    @Column(name = "vl_salario")
	private double salario;
    
	@Column(name = "qtd_carga_horaria")
	private int cargaHoraria;
	
	@OneToOne(mappedBy = "gerente")
	private Mercado mercado;
	
	

	
	public Gerente() {}

	public Gerente(String nome, Calendar dataNascimento, String telefone, Endereco endereco, double salario,
			int cargaHoraria) {
		super(nome, dataNascimento, telefone, endereco);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Gerente id:"+getId()+
				"\n Nome: "+getNome()+
				"\n Telefone: "+getTelefone()+
				"\n Salário: "+getSalario()+
				"\n Carga Horária: "+getCargaHoraria();
	}
	
	
	

	
	
	

	
	
	
}

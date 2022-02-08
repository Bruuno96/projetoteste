package br.com.projetoteste;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.projetoteste.model.Gerente;
import br.com.projetoteste.repository.PessoaRepository;
import br.com.projetoteste.service.GerenteService;

@SpringBootApplication
public class ProjetotesteApplication implements CommandLineRunner {

	// - Ponto de Injeção de dependência
	@Autowired
	private GerenteService service;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetotesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Instanciem um gerente e um endereço
		
//		Calendar c =  Calendar.getInstance();
//		c.set(1978, 5, 20);
//
//		Endereco endereco = new Endereco("Rua dos Nao sei", 0, "Existencia");
//
//		Gerente gerente = new Gerente("RaiTerra",c, "(11) 98888-2222",endereco, 5000.00, 8);
//		
//		// Persistencia de dados
//		service.create(gerente);
		
//		 Busca no banco de dados 
		List<Gerente> findAll = service.findAll();
		
		// Mostrar no console
		for(Gerente gerente : findAll){

			System.out.println(gerente.toString());

		}	
	}

}

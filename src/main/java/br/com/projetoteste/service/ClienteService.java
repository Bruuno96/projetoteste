package br.com.projetoteste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoteste.model.Cliente;
import br.com.projetoteste.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository pessoaRepository;

	
	public Cliente create(Cliente cliente) {
		return pessoaRepository.save(cliente);
	}
	
	public List<Cliente> findAll(){
		return pessoaRepository.findAll();
	}
}

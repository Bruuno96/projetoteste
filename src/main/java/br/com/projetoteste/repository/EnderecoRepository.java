package br.com.projetoteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoteste.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long>{

}

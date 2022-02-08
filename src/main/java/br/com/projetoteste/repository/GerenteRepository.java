package br.com.projetoteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.projetoteste.model.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente,Long> {

   
    
}

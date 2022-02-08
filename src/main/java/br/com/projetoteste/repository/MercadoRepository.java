package br.com.projetoteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.projetoteste.model.Mercado;

@Repository
public interface MercadoRepository extends JpaRepository<Mercado, Long>{

}

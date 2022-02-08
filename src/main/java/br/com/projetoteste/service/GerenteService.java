package br.com.projetoteste.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.projetoteste.model.Gerente;
import br.com.projetoteste.repository.GerenteRepository;

@Service
public class GerenteService {

    @Autowired
    private GerenteRepository gerenteRepository;

    public Gerente create(Gerente gerente) {
        return gerenteRepository.save(gerente);
    }
    
    public Gerente findGerente(Long id){
        return gerenteRepository.getById(id);
    }
    
    public List<Gerente> findAll() {
        return gerenteRepository.findAll();
    }
}

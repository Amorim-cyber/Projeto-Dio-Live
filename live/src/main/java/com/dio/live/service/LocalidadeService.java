package com.dio.live.service;

import com.dio.live.model.Empresa;
import com.dio.live.model.Localidade;
import com.dio.live.repository.EmpresaRepository;
import com.dio.live.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LocalidadeService {
    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository){
        this.localidadeRepository = localidadeRepository;
    }

    public Localidade save(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public List<Localidade> findAll(){
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> getById(Long idLocalidade){
        return localidadeRepository.findById(idLocalidade);
    }

    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public void delete(Long idLocalidade){
        localidadeRepository.deleteById(idLocalidade);
    }
}

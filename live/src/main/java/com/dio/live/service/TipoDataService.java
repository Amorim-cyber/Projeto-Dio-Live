package com.dio.live.service;

import com.dio.live.model.Ocorrencia;
import com.dio.live.model.TipoData;
import com.dio.live.repository.OcorrenciaRepository;
import com.dio.live.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TipoDataService {
    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(OcorrenciaRepository ocorrenciaRepository){
        this.tipoDataRepository = tipoDataRepository;
    }

    public TipoData save(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> findAll(){
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(Long idTipoData){
        return tipoDataRepository.findById(idTipoData);
    }

    public TipoData update(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }

    public void delete(Long idTipoData){
        tipoDataRepository.deleteById(idTipoData);
    }
}

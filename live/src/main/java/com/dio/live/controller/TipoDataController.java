package com.dio.live.controller;

import com.dio.live.model.Ocorrencia;
import com.dio.live.model.TipoData;
import com.dio.live.service.OcorrenciaService;
import com.dio.live.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }
    @GetMapping
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getTipoDataByID(@PathVariable("idTipoData") Long idTipoData) throws Exception {
        return ResponseEntity.ok(tipoDataService.getById(idTipoData).orElseThrow(() -> new NoSuchElementException("Tipo data não encontrada.")));
    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.update(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public ResponseEntity<TipoData> deleteTipoDataByID(@PathVariable("idTipoData") Long idTipoData){

        try{
            tipoDataService.delete(idTipoData);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }
}

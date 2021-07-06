package com.dio.live.controller;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.BancoHorasService;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.save(bancoHoras);
    }
    @GetMapping
    public List<BancoHoras> getBancoHorasList(){
        return bancoHorasService.findAll();
    }
    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception {
        return ResponseEntity.ok(bancoHorasService.getById(idBancoHoras).orElseThrow(() -> new NoSuchElementException("BancoHoras não encontrado.")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.update(bancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> deleteBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras){

        try{
            bancoHorasService.delete(idBancoHoras);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }
}

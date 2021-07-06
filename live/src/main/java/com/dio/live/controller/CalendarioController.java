package com.dio.live.controller;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.Calendario;
import com.dio.live.service.BancoHorasService;
import com.dio.live.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }
    @GetMapping
    public List<Calendario> getCalendarioList(){
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioByID(@PathVariable("idCalendario") Long idCalendario) throws Exception {
        return ResponseEntity.ok(calendarioService.getById(idCalendario).orElseThrow(() -> new NoSuchElementException("Calendario não encontrado.")));
    }

    @PutMapping
    public Calendario updateBancoHoras(@RequestBody Calendario calendario){
        return calendarioService.update(calendario);
    }

    @DeleteMapping("/{idCalendario}")
    public ResponseEntity<Calendario> deleteCalendarioByID(@PathVariable("idCalendario") Long idCalendario){

        try{
            calendarioService.delete(idCalendario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<Calendario>) ResponseEntity.ok();
    }
}

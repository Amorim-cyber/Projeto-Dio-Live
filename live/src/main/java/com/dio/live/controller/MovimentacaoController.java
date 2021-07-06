package com.dio.live.controller;

import com.dio.live.model.Localidade;
import com.dio.live.model.Movimentacao;
import com.dio.live.service.LocalidadeService;
import com.dio.live.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }
    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){
        return movimentacaoService.findAll();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getMovimentacaoByID(@PathVariable("idMovimentacao") Long idMovimentacao) throws Exception {
        return ResponseEntity.ok(movimentacaoService.getById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("Movimentação não encontrada.")));
    }

    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.update(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> deleteMovimentacaoByID(@PathVariable("idMovimentacao") Long idMovimentacao){

        try{
            movimentacaoService.delete(idMovimentacao);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();
    }
}

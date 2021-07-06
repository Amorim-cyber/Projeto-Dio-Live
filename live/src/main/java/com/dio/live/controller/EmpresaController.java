package com.dio.live.controller;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Empresa;
import com.dio.live.service.CategoriaUsuarioService;
import com.dio.live.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class EmpresaController {
    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }
    @GetMapping
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa) throws Exception {
        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new NoSuchElementException("Empresa não encontrada.")));
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.update(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> deleteEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa){

        try{
            empresaService.delete(idEmpresa);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<Empresa>) ResponseEntity.ok();
    }
}

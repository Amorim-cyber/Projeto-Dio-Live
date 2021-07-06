package com.dio.live.controller;

import com.dio.live.model.TipoData;
import com.dio.live.model.Usuario;
import com.dio.live.service.TipoDataService;
import com.dio.live.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createTipoData(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }
    @GetMapping
    public List<Usuario> getUsuarioDataList(){
        return usuarioService.findAll();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long idUsuario) throws Exception {
        return ResponseEntity.ok(usuarioService.getById(idUsuario).orElseThrow(() -> new NoSuchElementException("Usuário não encontrado.")));
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.update(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity<Usuario> deleteUsuarioByID(@PathVariable("idUsuario") Long idUsuario){

        try{
            usuarioService.delete(idUsuario);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return (ResponseEntity<Usuario>) ResponseEntity.ok();
    }
}

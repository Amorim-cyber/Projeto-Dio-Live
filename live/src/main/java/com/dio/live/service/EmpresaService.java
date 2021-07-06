package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.model.Empresa;
import com.dio.live.repository.CategoriaUsuarioRepository;
import com.dio.live.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmpresaService {
    EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAll(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getById(Long idEmpresa){
        return empresaRepository.findById(idEmpresa);
    }

    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void delete(Long idEmpresa){
        empresaRepository.deleteById(idEmpresa);
    }
}

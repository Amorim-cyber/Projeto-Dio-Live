package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.BancoHorasRepository;
import com.dio.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BancoHorasService {
    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository){
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras save(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAll(){
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getById(Long idBancoHoras){
        return bancoHorasRepository.findById(idBancoHoras);
    }

    public BancoHoras update(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public void delete(Long idBancoHoras){
        bancoHorasRepository.deleteById(idBancoHoras);
    }
}

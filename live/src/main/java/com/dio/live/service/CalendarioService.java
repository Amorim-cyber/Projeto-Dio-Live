package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.Calendario;
import com.dio.live.repository.BancoHorasRepository;
import com.dio.live.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CalendarioService {
    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository){
        this.calendarioRepository = calendarioRepository;
    }

    public Calendario save(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> findAll(){
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> getById(Long idCalendario){
        return calendarioRepository.findById(idCalendario);
    }

    public Calendario update(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public void delete(Long idCalendario){
        calendarioRepository.deleteById(idCalendario);
    }
}

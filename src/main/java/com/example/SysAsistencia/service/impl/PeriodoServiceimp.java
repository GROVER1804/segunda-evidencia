package com.example.SysAsistencia.service.impl;


import com.example.SysAsistencia.modelo.Periodo;
import com.example.SysAsistencia.repository.PeriodoRepository;
import com.example.SysAsistencia.service.PeriodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeriodoServiceimp implements PeriodoService{

    @Autowired
    PeriodoRepository periodoRepository;
    @Override
    public List<Periodo> obtenerPeriodos() {
        return periodoRepository.findAll();
    }

    @Override
    public Periodo obtenerPeriodo(Long id) {
        return periodoRepository.findById(id).orElse(new Periodo());
    }

    @Override
    public void guardarPeriodo(Periodo periodo) {
        periodoRepository.save(periodo);

    }

    @Override
    public void eliminarPeriodo(Long id) {
        periodoRepository.deleteById(id);

    }

    @Override
    public void actualizarPeriodo(Periodo periodo, Long id) {
        periodoRepository.save(periodo);

    }
}

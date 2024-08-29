package com.example.SysAsistencia.service;
import com.example.SysAsistencia.modelo.Periodo;

import java.util.List;
public interface PeriodoService {
    public List<Periodo> obtenerPeriodos();
    public Periodo obtenerPeriodo(Long id);
    public void guardarPeriodo(Periodo periodo);
    public void eliminarPeriodo(Long id);
    public void actualizarPeriodo(Periodo periodo,Long id);


}



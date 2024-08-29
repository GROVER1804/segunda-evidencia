package com.example.SysAsistencia.repository;

import com.example.SysAsistencia.modelo.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsistenciaRepository extends JpaRepository  <Asistencia, Integer>{
}

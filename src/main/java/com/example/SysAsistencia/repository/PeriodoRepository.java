package com.example.SysAsistencia.repository;

import com.example.SysAsistencia.modelo.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoRepository extends JpaRepository  <Periodo, Long>{
}

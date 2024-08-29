package com.example.SysAsistencia.repository;


import com.example.SysAsistencia.modelo.Acceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Integer>{
}

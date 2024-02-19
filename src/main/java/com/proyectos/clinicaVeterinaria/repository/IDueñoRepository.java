package com.proyectos.clinicaVeterinaria.repository;

import com.proyectos.clinicaVeterinaria.model.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueñoRepository extends JpaRepository<Dueño,Long> {
}

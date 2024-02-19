package com.proyectos.clinicaVeterinaria.service;

import com.proyectos.clinicaVeterinaria.model.Dueño;

import java.util.List;

public interface IDueñoService {
    //alta
    public void crearDueño(Dueño dueño);

    //baja
    public void eliminarDueño(Long id_dueño);

    //modificacion
    public void editarDueño(Dueño dueño);

    //lectura individual
    public Dueño traerDueño(Long id_dueño);

    //lectura de todos
    public List<Dueño> traerDueños();

}

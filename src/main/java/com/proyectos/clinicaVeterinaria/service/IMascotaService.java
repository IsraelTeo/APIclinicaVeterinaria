package com.proyectos.clinicaVeterinaria.service;

import com.proyectos.clinicaVeterinaria.dto.MascotaDueñoDTO;
import com.proyectos.clinicaVeterinaria.model.Dueño;
import com.proyectos.clinicaVeterinaria.model.Mascota;

import java.util.List;

public interface IMascotaService {

    //alta
    public void crearMascota(Mascota mascota);

    //baja
    public void eliminarMascota(Long id_mascota);

    //modificacion
    public void editarMascota(Mascota mascota);

    //lectura individual
    public Mascota traerMascota(Long id_mascota);

    //lectura de todos
    public List<Mascota> traerMascotas();

    //Obtener listado de todas las mascotas especie: perro y raza: caniche
    public List<Mascota> traerCaniches();

    //obtener un listado de datos de una mascota y su dueño
    public MascotaDueñoDTO listadoMascotaDueñoDTO(Long id_mascota);

}

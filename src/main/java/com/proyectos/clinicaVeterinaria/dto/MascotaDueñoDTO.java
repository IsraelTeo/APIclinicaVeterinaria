package com.proyectos.clinicaVeterinaria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class MascotaDueñoDTO implements Serializable {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_dueño;
    private String apellido_dueño;



}

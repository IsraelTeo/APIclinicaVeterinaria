package com.proyectos.clinicaVeterinaria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_dueño;
    @Basic
    private Long dni;
    private String nombre_dueño;
    private String apellido_dueño;
    private Long celular;

}

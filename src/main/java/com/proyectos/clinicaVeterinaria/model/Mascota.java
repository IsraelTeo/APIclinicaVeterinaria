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
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    @Basic
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String color;
    @OneToOne
    @JoinColumn (name = "un_dueño_id_dueño", referencedColumnName = "id_dueño")
    private Dueño unDueño;
}

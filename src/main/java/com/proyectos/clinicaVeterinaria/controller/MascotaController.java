package com.proyectos.clinicaVeterinaria.controller;

import com.proyectos.clinicaVeterinaria.dto.MascotaDueñoDTO;
import com.proyectos.clinicaVeterinaria.model.Mascota;
import com.proyectos.clinicaVeterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private IMascotaService mascoServ;

    //alta
    @PostMapping("/crear")
    public String crearMascota(@RequestBody Mascota masco){
        mascoServ.crearMascota(masco);
        return "La mascota fue creada correctamentre";
    }
    
    //baja
    @DeleteMapping("/eliminar/{id_mascota}")
    public String eliminarMascota(@PathVariable Long id_mascota){
        mascoServ.eliminarMascota(id_mascota);
        return "La mascota fue eliminada correctamente";
    }

    //modificacion
    @PutMapping("/editar")
    public String editarMascota(@RequestBody Mascota masco){
        mascoServ.editarMascota(masco);
        return "La mascota fue editada correctamente";
    }

    //lectura
    @GetMapping("/traer/{id_mascota}")
    @ResponseBody
    public Mascota traerMascota(@PathVariable Long id_mascota){
        return mascoServ.traerMascota(id_mascota);
    }

    //Lectura todas las mascotas
    @GetMapping("/traer/todos")
    @ResponseBody
    public List<Mascota> traerMascotas(){
        return mascoServ.traerMascotas();
    }

    //Lectura perros caniches
    @GetMapping("/traer/caniches")
    @ResponseBody
    public List<Mascota> traerCaniches(){
        return mascoServ.traerCaniches();
    }

    //Lectura datos combinados de una mascota y su dueño
    @GetMapping("/traerMascotayDueño/{id_mascota}")
    public MascotaDueñoDTO listadoMascotaDueñoDTO(@PathVariable Long id_mascota){
        return mascoServ.listadoMascotaDueñoDTO(id_mascota);
    }

}

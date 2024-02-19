package com.proyectos.clinicaVeterinaria.controller;

import com.proyectos.clinicaVeterinaria.model.Dueño;
import com.proyectos.clinicaVeterinaria.service.IDueñoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dueño")
public class DueñoController {
    @Autowired
    IDueñoService dueñoServ;

    //alta
    @PostMapping("/crear")
    public String crearDueño(@RequestBody Dueño dueño){
        dueñoServ.crearDueño(dueño);
        return "El dueño fue creado correctamente";
    }

    //baja
    @DeleteMapping("/eliminar/{id_dueño}")
    public String eliminarDueño(@PathVariable Long id_dueño){
        dueñoServ.eliminarDueño(id_dueño);
        return "El dueño fue eliminado correctamente";
    }

    //modificacion
    @PutMapping("/editar")
    public String editarDueño(@RequestBody Dueño dueño){
        dueñoServ.editarDueño(dueño);
        return "Dueño esditado correctamente.";
    }

    //lectura individual
    @GetMapping("/traer/{id_dueño}")
    @ResponseBody
    public Dueño traerDueño(@PathVariable Long id_dueño){
        return dueñoServ.traerDueño(id_dueño);
    }

    //lectura de todos
    @GetMapping("/traer/todos")
    @ResponseBody
    public List<Dueño> traerDueños(){
        return dueñoServ.traerDueños();
    }


}

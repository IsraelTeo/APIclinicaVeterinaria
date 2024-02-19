package com.proyectos.clinicaVeterinaria.service;

import com.proyectos.clinicaVeterinaria.model.Dueño;
import com.proyectos.clinicaVeterinaria.repository.IDueñoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DueñoService implements IDueñoService{

    @Autowired
    private IDueñoRepository dueñoRepo;


    @Override
    public void crearDueño(Dueño dueño) {
        dueñoRepo.save(dueño);
    }

    @Override
    public void eliminarDueño(Long id_dueño) {
        dueñoRepo.deleteById(id_dueño);
    }

    @Override
    public void editarDueño(Dueño dueño) {
        dueñoRepo.save(dueño);
    }

    @Override
    public Dueño traerDueño(Long id_dueño) {
        Dueño dueño = dueñoRepo.findById(id_dueño).orElse(null);
        return dueño;
    }

    @Override
    public List<Dueño> traerDueños() {
        List<Dueño> listaDueños = dueñoRepo.findAll();
        return listaDueños;
    }
}

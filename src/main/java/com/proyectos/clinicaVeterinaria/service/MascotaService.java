package com.proyectos.clinicaVeterinaria.service;

import com.proyectos.clinicaVeterinaria.dto.MascotaDueñoDTO;
import com.proyectos.clinicaVeterinaria.model.Dueño;
import com.proyectos.clinicaVeterinaria.model.Mascota;
import com.proyectos.clinicaVeterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    private IMascotaRepository mascoRepo;


    @Override
    public void crearMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public void eliminarMascota(Long id_mascota) {

        mascoRepo.deleteById(id_mascota);
    }

    @Override
    public void editarMascota(Mascota mascota) {

        mascoRepo.save(mascota);
    }

    @Override
    public Mascota traerMascota(Long id_mascota) {

        return mascoRepo.findById(id_mascota).orElse(null);
    }

    @Override
    public List<Mascota> traerMascotas() {
        List<Mascota> listaMascotas = mascoRepo.findAll();
        return listaMascotas;
    }

    @Override
    public List<Mascota> traerCaniches() {
        String palabra = "Caniche";
        String textoComparar;
        List<Mascota> listaMascotas = this.traerMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();
        for (Mascota mascota : listaMascotas) {
            if (palabra.equalsIgnoreCase(mascota.getRaza())) {
                listaCaniches.add(mascota);
            }
        }
        return listaCaniches;

    }

    @Override
    public MascotaDueñoDTO listadoMascotaDueñoDTO(Long id_mascota) {
        Mascota mascota = this.traerMascota(id_mascota);
        Dueño dueño = mascota.getUnDueño();

        MascotaDueñoDTO mascotaDueñoDTO = new MascotaDueñoDTO();
        mascotaDueñoDTO.setNombre_mascota(mascota.getNombre_mascota());
        mascotaDueñoDTO.setEspecie(mascota.getEspecie());
        mascotaDueñoDTO.setRaza(mascota.getRaza());

        if (dueño != null) {
            mascotaDueñoDTO.setNombre_dueño(dueño.getNombre_dueño());
            mascotaDueñoDTO.setApellido_dueño(dueño.getApellido_dueño());
        }

        return mascotaDueñoDTO;
    }
}

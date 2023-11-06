package com.GymVirtual.GymVirtual.Repositories;

import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import com.GymVirtual.GymVirtual.Models.PersonaModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EntrenadorRepositoryTest {
    @Autowired
    private EntrenadorRepository entrenadorRepository;


    @Test
    public void saveEntrenador(){
        PersonaModel persona = new PersonaModel();
        persona.setNombre("wen");
        persona.setApellido("gal");
        persona.setPeso(77);
        persona.setEstatura(1.60F);
        persona.setFechaNacimiento("2000/02/02");
        persona.setCorreo("wengal");
        persona.setClave("1234");

        EntrenadorModel entrenador = new EntrenadorModel();
        entrenador.setIdPersona(persona);


        entrenadorRepository.save(entrenador);
    }
}
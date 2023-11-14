package com.GymVirtual.GymVirtual.Cotrollers;

import com.GymVirtual.GymVirtual.Models.ClienteModel;
import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import com.GymVirtual.GymVirtual.Repositories.EntrenadorRepository;
import com.GymVirtual.GymVirtual.Services.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("entrenador")
public class EntrenadorController {
    @Autowired
    private EntrenadorService entrenadorService;
    @PostMapping
    public void insertEntrenador(@RequestBody EntrenadorModel entrenadorModel){
        entrenadorService.insetEntrenador(entrenadorModel);
    }

    @PostMapping("seccion")
    public EntrenadorModel getEntrenador(@RequestBody EntrenadorModel entrenadorModel){
        return entrenadorService.getEntrenador(entrenadorModel);
    }


    @PostMapping("login")
    public EntrenadorModel getLogin(@RequestBody EntrenadorModel entrenadorModel){
        return entrenadorService.getlogin(entrenadorModel);
    }
}


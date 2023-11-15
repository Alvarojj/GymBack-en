package com.GymVirtual.GymVirtual.Cotrollers;

import com.GymVirtual.GymVirtual.Models.EntrenamientoModel;
import com.GymVirtual.GymVirtual.Services.EntrenamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("entrenamiento")
public class EntrenamientoController {
    @Autowired
    EntrenamientoService entrenamientoService;

    @PostMapping
    public void insertEntrenamiento(@RequestBody EntrenamientoModel entrenamientoModel) {
        entrenamientoService.insertEntrenamiento(entrenamientoModel);
    }


    @PostMapping("cliente")
    public EntrenamientoModel getEntrenoDia(@RequestBody EntrenamientoModel entrenamientoModel){
        return entrenamientoService.getEntrenoDia(entrenamientoModel);
    }
}

package com.GymVirtual.GymVirtual.Cotrollers;


import com.GymVirtual.GymVirtual.Models.PersonaModel;
import com.GymVirtual.GymVirtual.Services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping()
    public List<PersonaModel> getPersonas(){
        return personaService.getPersonas();
    }

    }

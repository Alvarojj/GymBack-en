package com.GymVirtual.GymVirtual.Cotrollers;

import com.GymVirtual.GymVirtual.Models.MembresiaModel;
import com.GymVirtual.GymVirtual.Services.MembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("membresia")
public class MembresiaController {
    @Autowired
    MembresiaService membresiaService;

    @GetMapping
    public List<MembresiaModel> getMembresia(){
        return membresiaService.getMembresias();
    }
}

package com.GymVirtual.GymVirtual.Services;

import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import com.GymVirtual.GymVirtual.Models.EntrenamientoModel;
import com.GymVirtual.GymVirtual.Repositories.EntrenamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class EntrenamientoService {
    @Autowired
    EntrenamientoRepository entrenamientoRepository;


    public void insertEntrenamiento(EntrenamientoModel entrenamiento){
        entrenamientoRepository.save(entrenamiento);
    }


    public EntrenamientoModel getEntrenoDia(EntrenamientoModel entreno){

        Date myDate = new Date();
        String date = new SimpleDateFormat("yyyy-MM-dd").format(myDate);

        return entrenamientoRepository.findByFechaEntrenoAndAndCliente_IdCliente(date, entreno.getCliente().getIdCliente());
    }
}

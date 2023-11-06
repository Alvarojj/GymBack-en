package com.GymVirtual.GymVirtual.Services;

import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import com.GymVirtual.GymVirtual.Models.EntrenamientoModel;
import com.GymVirtual.GymVirtual.Repositories.EntrenamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrenamientoService {
    @Autowired
    EntrenamientoRepository entrenamientoRepository;


    public void insertEntrenamiento(EntrenamientoModel entrenamiento){
        entrenamientoRepository.save(entrenamiento);
    }


    public EntrenamientoModel getEntrenoDia(EntrenamientoModel entreno){
        return entrenamientoRepository.findByFechaEntrenoAndAndCliente_IdCliente(entreno.getFechaEntreno(), entreno.getCliente().getIdCliente());
    }
}

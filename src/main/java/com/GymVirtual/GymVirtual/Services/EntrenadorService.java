package com.GymVirtual.GymVirtual.Services;

import com.GymVirtual.GymVirtual.Models.ClienteModel;
import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import com.GymVirtual.GymVirtual.Repositories.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {
    @Autowired
    EntrenadorRepository entrenadorRepository;


    public void insetEntrenador(EntrenadorModel entrenadorModel){
        entrenadorRepository.save(entrenadorModel);

    }

    public List<EntrenadorModel> getEntrenador(){
        return (List<EntrenadorModel>) entrenadorRepository.findAll();
    }


    public EntrenadorModel getlogin(EntrenadorModel entrenador){
        EntrenadorModel foundClient =  entrenadorRepository.findByIdPersona_Correo(entrenador.getIdPersona().getCorreo());

        if (foundClient == null){
            return null;
        }
        if (entrenador.getIdPersona().getClave().equals(foundClient.getIdPersona().getClave())){
            return foundClient;
        }

        return null;
    }



}

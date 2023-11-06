package com.GymVirtual.GymVirtual.Services;

import ch.qos.logback.core.net.server.Client;
import com.GymVirtual.GymVirtual.Models.ClienteModel;
import com.GymVirtual.GymVirtual.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;


    public void insertCliente(ClienteModel clienteModel){
        clienteRepository.save(clienteModel);
    }


    public List<ClienteModel> getClientes(){
        return (List<ClienteModel>) clienteRepository.findAll();
    }



    public ClienteModel getlogin(ClienteModel clienteModel){
       ClienteModel foundClient =  clienteRepository.findByIdPersona_Correo(clienteModel.getIdPersona().getCorreo());

       if (foundClient == null){
           return null;
       }
       if (clienteModel.getIdPersona().getClave().equals(foundClient.getIdPersona().getClave())){
           return foundClient;
       }

       return null;
    }

    public List<ClienteModel> getClienteOfEntrenador(ClienteModel clienteModel){
        return clienteRepository.findByEntrenador_IdEntrenador(clienteModel.getEntrenador().getIdEntrenador());
    }
}

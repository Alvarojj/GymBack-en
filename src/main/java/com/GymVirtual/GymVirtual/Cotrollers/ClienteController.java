package com.GymVirtual.GymVirtual.Cotrollers;

import com.GymVirtual.GymVirtual.Models.ClienteModel;
import com.GymVirtual.GymVirtual.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;


    @PostMapping("informacion")
    public ClienteModel getClientes(@RequestBody ClienteModel clienteModel){return clienteService.getClientes(clienteModel);}


    @PostMapping
    public void insertarCliente(@RequestBody ClienteModel clienteModel){
        clienteService.insertCliente(clienteModel);
    }

    @PostMapping("login")
    public ClienteModel getlogin(@RequestBody ClienteModel clienteModel){
       return clienteService.getlogin(clienteModel);
    }

    @PostMapping("entrenador")
    public List<ClienteModel> getClienteOfEntrenador(@RequestBody ClienteModel clienteModel){
        return clienteService.getClienteOfEntrenador(clienteModel);
    }



}

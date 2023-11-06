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


    @GetMapping
    public List<ClienteModel> getClientes(){return clienteService.getClientes();}


    @PostMapping
    public void insertarCliente(@RequestBody ClienteModel clienteModel){
        clienteService.insertCliente(clienteModel);
    }

    @GetMapping("login")
    public ClienteModel getlogin(@RequestBody ClienteModel clienteModel){
       return clienteService.getlogin(clienteModel);
    }

    @GetMapping("entrenador")
    public List<ClienteModel> getClienteOfEntrenador(@RequestBody ClienteModel clienteModel){
        return clienteService.getClienteOfEntrenador(clienteModel);
    }
}

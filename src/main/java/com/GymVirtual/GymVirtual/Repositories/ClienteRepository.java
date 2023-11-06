package com.GymVirtual.GymVirtual.Repositories;

import ch.qos.logback.core.net.server.Client;
import com.GymVirtual.GymVirtual.Models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

    ClienteModel findByIdPersona_Correo(String correo);

    List<ClienteModel> findByEntrenador_IdEntrenador(int idEntrenador);
}

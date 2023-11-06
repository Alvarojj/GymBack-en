package com.GymVirtual.GymVirtual.Repositories;

import com.GymVirtual.GymVirtual.Models.EntrenadorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends JpaRepository<EntrenadorModel, Integer> {
    EntrenadorModel findByIdPersona_Correo(String correo);
}

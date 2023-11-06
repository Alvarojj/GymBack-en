package com.GymVirtual.GymVirtual.Repositories;

import com.GymVirtual.GymVirtual.Models.EntrenamientoModel;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenamientoRepository extends JpaRepository<EntrenamientoModel, Integer> {

    EntrenamientoModel findByFechaEntrenoAndAndCliente_IdCliente(String fecha, int cliente);
}

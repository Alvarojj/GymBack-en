package com.GymVirtual.GymVirtual.Repositories;

import com.GymVirtual.GymVirtual.Models.MembresiaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembresiaRepository extends JpaRepository<MembresiaModel, Integer> {
}

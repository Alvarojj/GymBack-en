package com.GymVirtual.GymVirtual.Repositories;

import com.GymVirtual.GymVirtual.Models.PersonaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepostory extends CrudRepository <PersonaModel, Integer> {
}

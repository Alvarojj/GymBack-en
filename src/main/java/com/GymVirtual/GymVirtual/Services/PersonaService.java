package com.GymVirtual.GymVirtual.Services;


import com.GymVirtual.GymVirtual.Models.PersonaModel;
import com.GymVirtual.GymVirtual.Repositories.PersonaRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaService {

    PersonaRepostory personaRepostory;
    @Autowired
    public PersonaService(PersonaRepostory personaRepostory){
        this.personaRepostory = personaRepostory;
    }
    public List<PersonaModel> getPersonas(){
        return (List<PersonaModel>) personaRepostory.findAll();
    }


}

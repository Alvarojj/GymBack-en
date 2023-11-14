package com.GymVirtual.GymVirtual.Services;

import com.GymVirtual.GymVirtual.Models.MembresiaModel;
import com.GymVirtual.GymVirtual.Repositories.MembresiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembresiaService {
    @Autowired
    MembresiaRepository membresiaRepository;


    public List<MembresiaModel> getMembresias(){
        return membresiaRepository.findByBinActivo(1);
    }
}

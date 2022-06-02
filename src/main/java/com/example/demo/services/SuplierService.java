package com.example.demo.services;

import com.example.demo.entities.Suplier;
import com.example.demo.repository.SuplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuplierService {
    @Autowired
    private SuplierRepository suplierRepository;
    public List<Suplier> find(){
        return suplierRepository.findAll();
    }
    public Suplier save(Suplier suplier){
        return suplierRepository.save(suplier);
    }
    public void deleteById(Integer id){

        suplierRepository.deleteById(id);
    }

}

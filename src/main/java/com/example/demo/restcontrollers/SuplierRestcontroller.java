package com.example.demo.restcontrollers;

import com.example.demo.entities.Suplier;
import com.example.demo.services.SuplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SuplierRestcontroller {

    @Autowired
    private SuplierService suplierService;
    @GetMapping()
    public List<Suplier>find(){
        return suplierService.find();

    }
    @PostMapping()
    public Suplier save(@RequestBody Suplier suplier){
        return suplierService.save(suplier);

    }
}

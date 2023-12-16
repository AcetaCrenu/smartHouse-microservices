package ma.merbah.servicevoiture.controllers;

import ma.merbah.servicevoiture.entities.Voiture;
import ma.merbah.servicevoiture.repositories.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    private VoitureRepository voitureRepository;

    @GetMapping("/voitures")
    public List findAll(){return voitureRepository.findAll();}
    @GetMapping("/clients/{id}")
    public Voiture findById(@PathVariable Long id) throws Exception{
        return this.voitureRepository.findById(id).orElseThrow(()->new Exception("Cette voiture n'existe pas"));
    }
}

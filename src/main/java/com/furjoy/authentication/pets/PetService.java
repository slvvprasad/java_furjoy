package com.furjoy.authentication.pets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;
    
    public void savePet(Pet pet) {
        petRepository.save(pet);
    }
    
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
    
    public Pet getPetById(Long id) {
        return petRepository.findById(id).orElse(null);
    }
}


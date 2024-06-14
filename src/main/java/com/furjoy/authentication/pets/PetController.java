package com.furjoy.authentication.pets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping("/putadoption")
    public String showAdoptionForm() {
        return "putadoptionform";
    }

    @PostMapping("/putadoption")
    public String processAdoptionForm(Pet pet) {
        petService.savePet(pet);
        return "redirect:/adoptpetsdisplay";
    }

    @GetMapping("/adoptpetsdisplay")
    public String showAdoptedPets(Model model) {
        List<Pet> pets = petService.getAllPets();
        model.addAttribute("pets", pets);
        return "adoptpetsdisplay";
    }
    
    @GetMapping("/viewpetdetails/{petId}")
    public String viewPetDetails(@PathVariable Long petId, Model model) {
        Pet pet = petService.getPetById(petId);
        model.addAttribute("pet", pet);
        return "petdetails";
    }
}

package com.furjoy.authentication.pets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
    // Custom query methods can be added here if needed
}


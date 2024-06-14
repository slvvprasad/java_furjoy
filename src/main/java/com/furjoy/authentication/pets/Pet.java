package com.furjoy.authentication.pets;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String petName;
    private String petType;
    private String breed;
    private String ownerName;
    private String ownerPhoneNumber;
    private String ownerEmail;
    private String ownerLocation;
    private String petHealthStatus;
    private String petDescription;
    private String petImageUrl;
    private String petGender; // New field for pet's gender
    private int petAge; // New field for pet's age

    public Pet() {
        // Default constructor
    }

    // Constructors with all fields
    public Pet(String petName, String petType, String breed, String ownerName, String ownerPhoneNumber, String ownerEmail, String ownerLocation, String petHealthStatus, String petDescription, String petImageUrl, String petGender, int petAge) {
        this.petName = petName;
        this.petType = petType;
        this.breed = breed;
        this.ownerName = ownerName;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.ownerEmail = ownerEmail;
        this.ownerLocation = ownerLocation;
        this.petHealthStatus = petHealthStatus;
        this.petDescription = petDescription;
        this.petImageUrl = petImageUrl;
        this.petGender = petGender;
        this.petAge = petAge;
    }

    // Getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerLocation() {
        return ownerLocation;
    }

    public void setOwnerLocation(String ownerLocation) {
        this.ownerLocation = ownerLocation;
    }

    public String getPetHealthStatus() {
        return petHealthStatus;
    }

    public void setPetHealthStatus(String petHealthStatus) {
        this.petHealthStatus = petHealthStatus;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
    }

    public String getPetImageUrl() {
        return petImageUrl;
    }

    public void setPetImageUrl(String petImageUrl) {
        this.petImageUrl = petImageUrl;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
}

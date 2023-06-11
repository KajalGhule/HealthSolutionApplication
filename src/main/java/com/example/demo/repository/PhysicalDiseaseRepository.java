package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.PhysicalDisease;

public interface PhysicalDiseaseRepository extends JpaRepository<PhysicalDisease, Long>{
    
}

package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PhysicalDisease;
import com.example.demo.entities.PhysicalHealth;

@Repository
public interface PhysicalHealthRepository extends JpaRepository<PhysicalHealth, Long>{
    @Query("SELECT p FROM PhysicalHealth p WHERE p.physicalHealthProblem = :physicalHealthProblem")
	PhysicalHealth findByDisease(@Param("physicalHealthProblem") String physicalHealthProblem);
//   @Query("SELECT p FROM PhysicalHealth p")
//   List<PhysicalHealth> getAll();
}

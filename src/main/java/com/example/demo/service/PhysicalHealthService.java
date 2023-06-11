package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.PhysicalDisease;
import com.example.demo.entities.PhysicalHealth;
import com.example.demo.entities.UserHealthType;
import com.example.demo.repository.PhysicalDiseaseRepository;
import com.example.demo.repository.PhysicalHealthRepository;
import com.example.demo.response.PhysicalDiseaseResponse;
import com.example.demo.response.PhysicalHealthResponse;

@Service
public class PhysicalHealthService {
    @Autowired
    private PhysicalHealthRepository physicalHealthRepository; 
    @Autowired
    private PhysicalDiseaseRepository physicalDiseaseRepository;
    
	public List<PhysicalHealthResponse> getDiseaseDetails() {
		List<PhysicalHealth> physicalHealthList = physicalHealthRepository.findAll();
		List<PhysicalHealthResponse> response = new ArrayList<>();
		physicalHealthList.forEach(list -> {//String physicalHealthProblem, List<String> diet, String exerciseLink,
			//UserHealthType healthTypeId
			response.add(new PhysicalHealthResponse(list.getPhysicalHealthProblem(), list.getDiet(), list.getExerciseLink(), list.getHealthTypeId()));
		});
		return response;
	}
	public List<PhysicalDiseaseResponse> getAllDisease() {
		List<PhysicalDisease> diseaseList = physicalDiseaseRepository.findAll();
		List<PhysicalDiseaseResponse> response = new ArrayList<>();
		diseaseList.forEach(list -> {
			response.add(new PhysicalDiseaseResponse(list.getDisease()));
		});
		return response;
	}
	public PhysicalHealthResponse getDiseaseDetail(String disease) {
		PhysicalHealth diseaseList = physicalHealthRepository.findByDisease(disease);
		return new PhysicalHealthResponse(diseaseList.getPhysicalHealthProblem(),diseaseList.getDiet(),diseaseList.getExerciseLink(),diseaseList.getHealthTypeId());
	}
	
}

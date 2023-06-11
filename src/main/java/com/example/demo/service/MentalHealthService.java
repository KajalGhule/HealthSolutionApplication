package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.MentalHealth;
import com.example.demo.entities.PhysicalHealth;
import com.example.demo.repository.MentalHealthRepository;
import com.example.demo.response.MentalHealthResponse;
import com.example.demo.response.PhysicalHealthResponse;


@Service
public class MentalHealthService {
    
	@Autowired
	private MentalHealthRepository mentalHealthRepository;
	public List<MentalHealthResponse> getDetails() {
		List<MentalHealth> list = mentalHealthRepository.findAll();
		List<MentalHealthResponse> response = new ArrayList<>();
		list.forEach(li -> {
			response.add(new MentalHealthResponse(li.getLink(),li.getLinkType()));
		});
		return response;
	}

	
}

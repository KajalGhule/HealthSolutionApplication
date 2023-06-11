package com.example.demo.response;

import java.util.List;

import com.example.demo.entities.UserHealthType;

public class PhysicalHealthResponse {
	private String physicalHealthProblem;
    private String diet;
    private String exerciseLink;
    private UserHealthType healthTypeId;
    
    public PhysicalHealthResponse() {
		// TODO Auto-generated constructor stub
	}
    
	public PhysicalHealthResponse(String physicalHealthProblem, String diet, String exerciseLink,
			UserHealthType healthTypeId) {
		super();
		this.physicalHealthProblem = physicalHealthProblem;
		this.diet = diet;
		this.exerciseLink = exerciseLink;
		this.healthTypeId = healthTypeId;
	}

	public String getPhysicalHealthProblem() {
		return physicalHealthProblem;
	}

	public void setPhysicalHealthProblem(String physicalHealthProblem) {
		this.physicalHealthProblem = physicalHealthProblem;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getExerciseLink() {
		return exerciseLink;
	}

	public void setExerciseLink(String exerciseLink) {
		this.exerciseLink = exerciseLink;
	}

	public UserHealthType getHealthTypeId() {
		return healthTypeId;
	}

	public void setHealthTypeId(UserHealthType healthTypeId) {
		this.healthTypeId = healthTypeId;
	}

	@Override
	public String toString() {
		return "PhysicalHealthResponse [physicalHealthProblem=" + physicalHealthProblem + ", diet=" + diet
				+ ", exerciseLink=" + exerciseLink + ",HealthTypeId=" + healthTypeId +"]";
	}
    
	
    
}

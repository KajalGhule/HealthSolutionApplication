package com.example.demo.response;

public class PhysicalDiseaseResponse {
     private String disease;
     public PhysicalDiseaseResponse() {
		// TODO Auto-generated constructor stub
	}
	public PhysicalDiseaseResponse(String disease) {
		super();
		this.disease = disease;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "PhysicalDisease [disease=" + disease + "]";
	}
     
}

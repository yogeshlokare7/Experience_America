package com.experience.dto;

public class CandidateAllergyDto {

	Integer candidateAllergyId;
	String allergyName;
	String allergyDescription;

	public Integer getCandidateAllergyId() {
		return candidateAllergyId;
	}

	public void setCandidateAllergyId(Integer candidateAllergyId) {
		this.candidateAllergyId = candidateAllergyId;
	}

	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}

	public String getAllergyDescription() {
		return allergyDescription;
	}

	public void setAllergyDescription(String allergyDescription) {
		this.allergyDescription = allergyDescription;
	}

}

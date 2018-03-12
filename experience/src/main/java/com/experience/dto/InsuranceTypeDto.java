package com.experience.dto;

public class InsuranceTypeDto {

	Integer insurancetypeId;
	String insuranceTypeName;
	String description;

	public Integer getInsurancetypeId() {
		return insurancetypeId;
	}

	public void setInsurancetypeId(Integer insurancetypeId) {
		this.insurancetypeId = insurancetypeId;
	}

	public String getInsuranceTypeName() {
		return insuranceTypeName;
	}

	public void setInsuranceTypeName(String insuranceTypeName) {
		this.insuranceTypeName = insuranceTypeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}

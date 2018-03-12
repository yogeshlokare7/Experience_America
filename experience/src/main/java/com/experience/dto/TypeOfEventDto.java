package com.experience.dto;

public class TypeOfEventDto {

	Integer eventTypeId;
	String eventTypeName;
	String chargeableAmount;

	public Integer getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(Integer eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getEventTypeName() {
		return eventTypeName;
	}

	public void setEventTypeName(String eventTypeName) {
		this.eventTypeName = eventTypeName;
	}

	public String getChargeableAmount() {
		return chargeableAmount;
	}

	public void setChargeableAmount(String chargeableAmount) {
		this.chargeableAmount = chargeableAmount;
	}

}

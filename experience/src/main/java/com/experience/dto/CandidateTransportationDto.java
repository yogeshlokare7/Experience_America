package com.experience.dto;

import java.sql.Time;
import java.util.Date;

public class CandidateTransportationDto {

	String transportationId;
	Date travelDate;
	Time pickupTime;
	Time dropTime;

	public String getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(String transportationId) {
		this.transportationId = transportationId;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Time getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(Time pickupTime) {
		this.pickupTime = pickupTime;
	}

	public Time getDropTime() {
		return dropTime;
	}

	public void setDropTime(Time dropTime) {
		this.dropTime = dropTime;
	}

}

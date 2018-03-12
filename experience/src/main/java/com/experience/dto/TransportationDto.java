package com.experience.dto;

import java.util.Date;

public class TransportationDto {

	Integer transport_id;
	String name;
	String vehicleType;
	Integer vehicleNo;
	Date travelDate;
	String startTime;
	String endTime;
	double  fare;

	public Integer getTransport_id() {
		return transport_id;
	}
	public void setTransport_id(Integer transport_id) {
		this.transport_id = transport_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Integer getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(Integer vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}

}

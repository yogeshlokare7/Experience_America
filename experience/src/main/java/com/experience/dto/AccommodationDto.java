package com.experience.dto;

import java.util.Date;

public class AccommodationDto {

	Integer accommodationId;
	String accommodationDays;
	Date startDate;
	Date endDate;
	String checkIn;
	String checkOut;
	double fare;
	String latitude;
	String longitude;

	public Integer getAccommodationId() {
		return accommodationId;
	}

	public void setAccommodationId(Integer accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getAccommodationDays() {
		return accommodationDays;
	}

	public void setAccommodationDays(String accommodationDays) {
		this.accommodationDays = accommodationDays;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "AccommodationDto [accommodationId=" + accommodationId + ", accommodationDays=" + accommodationDays + ", startDate=" + startDate + ", endDate=" + endDate + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", fare=" + fare + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}

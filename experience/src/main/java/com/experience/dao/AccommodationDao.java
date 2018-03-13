package com.experience.dao;

import java.util.List;

import com.experience.entity.Accommodation;
import com.experience.entity.AccommodationType;

public interface AccommodationDao {

	public Integer saveAccommodation(AccommodationType accommodation) throws Exception;

	public Integer updateAccommodation(AccommodationType accommodation) throws Exception;

	public void deleteAccommodation(AccommodationType accommodation) throws Exception;

	public Accommodation getAccommodation(Integer accommodationId) throws Exception;

	public List<Accommodation> getAccommodationList() throws Exception;
	
}

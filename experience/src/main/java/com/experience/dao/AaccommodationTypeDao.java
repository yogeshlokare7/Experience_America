package com.experience.dao;

import java.util.List;

import com.experience.entity.AccommodationType;

public interface AaccommodationTypeDao {
	
	public Integer saveAaccommodationType(AccommodationType accommodationType) throws Exception;

	public Integer updateAaccommodationType(AccommodationType accommodationType) throws Exception;

	public void deleteAaccommodationType(AccommodationType accommodationType) throws Exception;

	public AccommodationType getAaccommodationType(Integer accommodationTypeId) throws Exception;

	public List<AccommodationType> getAaccommodationTypeList() throws Exception;
	
}

package com.experience.dao;

import java.util.List;

import com.experience.entity.VenueDetails;

public interface VenueDetailsDao {
	
	public Integer saveVenueDetails(VenueDetails venueDetails);

	public Integer updateVenueDetails(VenueDetails venueDetails);

	public void deleteVenueDetails(VenueDetails venueDetails);

	public VenueDetails getVenueDetails(Integer venueDetailsId);

	public List<VenueDetails> getVenueDetailsList();
	
}

package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.VenueDetails;
import com.experience.service.VenueDetailsService;

@Repository
public class VenueDetailsServiceImpl extends EntityTransactionServiceImpl<VenueDetails> implements VenueDetailsService{
	
	@Autowired
	private SessionFactory sessionFactory;

	public Integer saveVenueDetails(VenueDetails venueDetails) throws Exception {
		return saveEntity(venueDetails, sessionFactory);
	}

	public VenueDetails updateVenueDetails(VenueDetails venueDetails) throws Exception {
		return updateEntity(venueDetails, sessionFactory);
	}

	public void deleteVenueDetails(VenueDetails venueDetails) throws Exception {
		deleteEntity(venueDetails, sessionFactory);
	}

	public VenueDetails getVenueDetails(Integer venueDetailsId) throws Exception {
		return getEntity(new VenueDetails(),venueDetailsId, sessionFactory);
	}

	public List<VenueDetails> getVenueDetailsList() throws Exception {
		return getEntityList(new VenueDetails(), sessionFactory);
	}

}

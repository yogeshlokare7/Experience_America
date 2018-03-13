package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.Transportation;
import com.experience.service.TransportationService;

@Repository
public class TransportationServiceImpl extends EntityTransactionServiceImpl<Transportation> implements TransportationService{

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveTransportation(Transportation transportation) throws Exception {
		return saveEntity(transportation, sessionFactory);
	}

	public Transportation updateTransportation(Transportation transportation) throws Exception {
		return updateEntity(transportation, sessionFactory);
	}

	public void deleteTransportation(Transportation transportation) throws Exception {
		deleteEntity(transportation, sessionFactory);
	}

	public Transportation getTransportation(Integer transportationId) throws Exception {
		return getEntity(new Transportation(), transportationId, sessionFactory);
	}

	public List<Transportation> getTransportationList() throws Exception {
		return getEntityList(new Transportation(), sessionFactory);
	}
	
	
}

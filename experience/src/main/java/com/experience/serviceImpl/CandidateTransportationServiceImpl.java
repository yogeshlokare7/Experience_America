package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.CandidateTransportation;
import com.experience.service.CandidateTransportationService;

@Repository
public class CandidateTransportationServiceImpl extends EntityTransactionServiceImpl<CandidateTransportation> implements CandidateTransportationService{

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception {
		return saveEntity(candidateTransportation, sessionFactory);
	}

	public CandidateTransportation updateCandidateTransportation(CandidateTransportation candidateTransportation)
			throws Exception {
		return updateEntity(candidateTransportation, sessionFactory);
	}

	public void deleteCandidateTransportation(CandidateTransportation candidateTransportation) throws Exception {
		deleteEntity(candidateTransportation, sessionFactory);
	}

	public CandidateTransportation getCandidateTransportation(Integer candidateTransportationId) throws Exception {
		return getEntity(new CandidateTransportation(), candidateTransportationId, sessionFactory);
	}

	public List<CandidateTransportation> getCandidateTransportationList() throws Exception {
		return getEntityList(new CandidateTransportation(), sessionFactory);
	}

	
}

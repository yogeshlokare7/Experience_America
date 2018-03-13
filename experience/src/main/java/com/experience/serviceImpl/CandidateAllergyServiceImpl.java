package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.CandidateAllergy;
import com.experience.service.CandidateAllergyService;

@Repository
public class CandidateAllergyServiceImpl extends EntityTransactionServiceImpl<CandidateAllergy> implements CandidateAllergyService{

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception {
		return saveEntity(candidateAllergy, sessionFactory);
	}

	public CandidateAllergy updateCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception {
		return updateEntity(candidateAllergy, sessionFactory);
	}

	public void deleteCandidateAllergy(CandidateAllergy candidateAllergy) throws Exception {
		deleteEntity(candidateAllergy, sessionFactory);
	}

	public CandidateAllergy getCandidateAllergy(Integer candidateAllergyId) throws Exception {
		return getEntity(new CandidateAllergy(), candidateAllergyId, sessionFactory);
	}

	public List<CandidateAllergy> getCandidateAllergyList() throws Exception {
		return getEntityList(new CandidateAllergy(), sessionFactory);
	}


}

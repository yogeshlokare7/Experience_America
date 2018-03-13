package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.Medical;
import com.experience.service.MedicalService;

@Repository
public class MedicalServiceImpl extends EntityTransactionServiceImpl<Medical> implements MedicalService{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveMedical(Medical medical) throws Exception {
		return saveEntity(medical, sessionFactory);
	}

	public Medical updateMedical(Medical medical) throws Exception {
		return updateEntity(medical, sessionFactory);
	}

	public void deleteMedical(Medical medical) throws Exception {
		deleteEntity(medical, sessionFactory);
	}

	public Medical getMedical(Integer medicalId) throws Exception {
		return getEntity(new Medical(), medicalId, sessionFactory);
	}

	public List<Medical> getMedicalList() throws Exception {
		return getEntityList(new Medical(), sessionFactory);
	}
	
}

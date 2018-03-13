package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.InsuranceType;
import com.experience.service.InsuranceTypeService;

@Repository
public class InsuranceTypeServiceImpl extends EntityTransactionServiceImpl<InsuranceType> implements InsuranceTypeService{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveInsuranceType(InsuranceType insuranceType) throws Exception {
		return saveEntity(insuranceType, sessionFactory);
	}

	public InsuranceType updateInsuranceType(InsuranceType insuranceType) throws Exception {
		return updateEntity(insuranceType, sessionFactory);
	}

	public void deleteInsuranceType(InsuranceType insuranceType) throws Exception {
		deleteEntity(insuranceType, sessionFactory);
	}

	public InsuranceType getInsuranceType(Integer insuranceTypeId) throws Exception {
		return getEntity(new InsuranceType(), insuranceTypeId, sessionFactory);
	}

	public List<InsuranceType> getInsuranceTypeList() throws Exception {
		return getEntityList(new InsuranceType(), sessionFactory);
	}
	
	

}

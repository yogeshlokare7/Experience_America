package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.PaymentType;
import com.experience.service.PaymentTypeService;

@Repository
public class PaymentTypeServiceImpl extends EntityTransactionServiceImpl<PaymentType> implements PaymentTypeService{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer savePaymentType(PaymentType paymentType) throws Exception {
		return saveEntity(paymentType, sessionFactory);
	}

	public PaymentType updatePaymentType(PaymentType paymentType) throws Exception {
		return updateEntity(paymentType, sessionFactory);
	}

	public void deletePaymentType(PaymentType paymentType) throws Exception {
		deleteEntity(paymentType, sessionFactory);
	}

	public PaymentType getPaymentType(Integer paymentTypeId) throws Exception {
		return getEntity(new PaymentType(), paymentTypeId, sessionFactory);
	}

	public List<PaymentType> getPaymentTypeList() throws Exception {
		return getEntityList(new PaymentType(), sessionFactory);
	}

}

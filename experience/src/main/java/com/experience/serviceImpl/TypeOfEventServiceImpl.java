package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.TypeOfEvent;
import com.experience.service.TypeOfEventService;


@Repository
public class TypeOfEventServiceImpl extends EntityTransactionServiceImpl<TypeOfEvent> implements TypeOfEventService {

	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		return saveEntity(typeOfEvent, sessionFactory);
	}

	public TypeOfEvent updateTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		return updateEntity(typeOfEvent, sessionFactory);
	}

	public void deleteTypeOfEvent(TypeOfEvent typeOfEvent) throws Exception {
		deleteEntity(typeOfEvent, sessionFactory);
	}

	public TypeOfEvent getTypeOfEvent(Integer typeOfEventId) throws Exception {
		return getEntity(new TypeOfEvent(), typeOfEventId, sessionFactory);
	}

	public List<TypeOfEvent> getTypeOfEventList() throws Exception {
		return getEntityList(new TypeOfEvent(), sessionFactory);
	}

}

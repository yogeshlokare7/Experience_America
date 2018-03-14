package com.experience.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.dao.EventStatusDao;
import com.experience.entity.EventStatus;
import com.experience.service.EventStatusService;

@Repository
public class EventStatusServiceImpl  implements EventStatusService{

	@Autowired
	protected EventStatusDao eventStatusDao;

	public Integer saveEventStatus(EventStatus eventStatus) throws Exception {
		return eventStatusDao.saveEventStatus(eventStatus);
	}

	public Integer updateEventStatus(EventStatus eventStatus) throws Exception {
		return eventStatusDao.updateEventStatus(eventStatus);
	}

	public void deleteEventStatus(EventStatus eventStatus) throws Exception {
		eventStatusDao.deleteEventStatus(eventStatus);
	}

	public EventStatus getEventStatus(Integer eventStatusId) throws Exception {
		// TODO Auto-generated method stub
		return eventStatusDao.getEventStatus(eventStatusId);
	}

	public List<EventStatus> getEventStatusList() throws Exception {
		return eventStatusDao.getEventStatusList();
	}


	
}

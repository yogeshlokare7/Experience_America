package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.entity.MarketPlace;
import com.experience.service.MarketPlaceService;

@Repository
public class MarketPlaceServiceImpl extends EntityTransactionServiceImpl<MarketPlace> implements MarketPlaceService{


	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveMarketPlace(MarketPlace marketPlace) throws Exception {
		return saveEntity(marketPlace, sessionFactory);
	}

	public MarketPlace updateMarketPlace(MarketPlace marketPlace) throws Exception {
		return updateEntity(marketPlace, sessionFactory);
	}

	public void deleteMarketPlace(MarketPlace marketPlace) throws Exception {
		deleteEntity(marketPlace, sessionFactory);
	}

	public MarketPlace getMarketPlace(Integer marketPlaceId) throws Exception {
		return getEntity(new MarketPlace(), marketPlaceId, sessionFactory);
	}

	public List<MarketPlace> getMarketPlaceList() throws Exception {
		return getEntityList(new MarketPlace(), sessionFactory);
	}


}

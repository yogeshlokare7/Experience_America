package com.experience.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.experience.daoImpl.EntityTransactionImpl;
import com.experience.entity.ItemDetails;
import com.experience.service.ItemDetailsService;

@Repository
public class ItemDetailsServiceImpl extends EntityTransactionImpl<ItemDetails> implements ItemDetailsService{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Integer saveItemDetails(ItemDetails itemDetails) throws Exception {
		return saveEntity(itemDetails, sessionFactory);
	}

	public ItemDetails updateItemDetails(ItemDetails itemDetails) throws Exception {
		return updateEntity(itemDetails, sessionFactory);
	}

	public void deleteItemDetails(ItemDetails itemDetails) throws Exception {
		deleteEntity(itemDetails, sessionFactory);
	}

	public ItemDetails getItemDetails(Integer itemDetailsId) throws Exception {
		return getEntity(new ItemDetails(), itemDetailsId, sessionFactory);
	}

	public List<ItemDetails> getItemDetailsList() throws Exception {
		return getEntityList(new ItemDetails(), sessionFactory);
	}
	
	

}

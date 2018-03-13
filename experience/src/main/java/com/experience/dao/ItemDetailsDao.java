package com.experience.dao;

import java.util.List;

import com.experience.entity.ItemDetails;

public interface ItemDetailsDao {

	public Integer saveItemDetails(ItemDetails inventory) throws Exception;

	public Integer updateItemDetails(ItemDetails inventory) throws Exception;

	public void deleteItemDetails(ItemDetails inventory) throws Exception;

	public ItemDetails getItemDetails(Integer inventoryId) throws Exception;

	public List<ItemDetails> getItemDetailsList() throws Exception;
	
}

package com.experience.dto;

public class FoodItemsDto {
	
	Integer food_items_id;
	String itemName;
	String itemType;
	String itemMenu;
	double itemPrice;
	String itemAvailable;

	public Integer getFood_items_id() {
		return food_items_id;
	}

	public void setFood_items_id(Integer food_items_id) {
		this.food_items_id = food_items_id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemMenu() {
		return itemMenu;
	}

	public void setItemMenu(String itemMenu) {
		this.itemMenu = itemMenu;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemAvailable() {
		return itemAvailable;
	}

	public void setItemAvailable(String itemAvailable) {
		this.itemAvailable = itemAvailable;
	}
	
}

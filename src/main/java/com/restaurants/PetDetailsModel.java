package com.restaurants;

public class PetDetailsModel {
	
	private String restaurantId;
	private String petAllowed;
	private int nosOfPetAllowed;
	private int cost;
	private String comments;
	
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getPetAllowed() {
		return petAllowed;
	}
	public void setPetAllowed(String petAllowed) {
		this.petAllowed = petAllowed;
	}
	public int getNosOfPetAllowed() {
		return nosOfPetAllowed;
	}
	public void setNosOfPetAllowed(int nosOfPetAllowed) {
		this.nosOfPetAllowed = nosOfPetAllowed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	 

}

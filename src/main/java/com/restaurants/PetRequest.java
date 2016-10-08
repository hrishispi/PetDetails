package com.restaurants;

public class PetRequest {
	
	private String restId;
	private String petAllowed;
	private int nosOfPetAllowed;
	private int cost; 
	private String comments;
	public String getRestId() {
		return restId;
	}
	public void setRestId(String restId) {
		this.restId = restId;
	}
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
	

}

package com.carlos.FoodAppLogin;

import javax.persistence.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Menu")

public class Menu {
	
	private String idmenu;
	private String idrestaurant;
	private Meal[] meals;
	
	
	
	
	public Menu(String idmenu, String idrestaurant, Meal[] meals) {
		super();
		this.idmenu = idmenu;
		this.idrestaurant = idrestaurant;
		this.meals = meals;
	}
	/**
	 * @return the idmenu
	 */
	public String getIdmenu() {
		return idmenu;
	}
	/**
	 * @param idmenu the idmenu to set
	 */
	public void setIdmenu(String idmenu) {
		this.idmenu = idmenu;
	}
	/**
	 * @return the idRestaurant
	 */
	public String getIdRestaurant() {
		return idrestaurant;
	}
	/**
	 * @param idRestaurant the idRestaurant to set
	 */
	public void setIdRestaurant(String idrestaurant) {
		this.idrestaurant = idrestaurant;
	}
	/**
	 * @return the meals
	 */
	public Meal[] getMeals() {
		return meals;
	}
	/**
	 * @param meals the meals to set
	 */
	public void setMeals(Meal[] meals) {
		this.meals = meals;
	}
	
	

}

package com.carlos.FoodAppLogin;

import javax.persistence.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "meals")

public class Meal {

	String idMeal;
	String strMeal;
	String description;
	String course;
	String category;
	String price;
	String imageurl;
	
	public Meal() {
		
	}
	
	public Meal(String idMeal, String name, String description, String course, String category, String price,
			String imageurl) {
		super();
		this.idMeal = idMeal;
		this.strMeal = name;
		this.description = description;
		this.course = course;
		this.category = category;
		this.price = price;
		this.imageurl = imageurl;
	}
	/**
	 * @return the idMeal
	 */
	public String getIdMeal() {
		return idMeal;
	}
	/**
	 * @param idMeal the idMeal to set
	 */
	public void setIdMeal(String idMeal) {
		this.idMeal = idMeal;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return strMeal;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.strMeal = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the imageurl
	 */
	public String getImageurl() {
		return imageurl;
	}
	/**
	 * @param imageurl the imageurl to set
	 */
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
	
	
	
}

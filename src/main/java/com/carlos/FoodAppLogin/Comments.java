package com.carlos.FoodAppLogin;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Comments")

public class Comments {
	@Id
	String id;
	String idfonda;
	String _iduser;
	String title;
	String body;
	String rating;
	
	
	
	public Comments() {
		
	}
	
	public Comments(String id,String idfonda, String _iduser, String title, String body, String rating) {
		super();
		this.id = id;
		this.idfonda = idfonda;
		this._iduser = _iduser;
		this.title = title;
		this.body = body;
		this.rating = rating;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdfonda() {
		return idfonda;
	}

	public void setIdfonda(String idfonda) {
		this.idfonda = idfonda;
	}
	
	public String get_iduser() {
		return _iduser;
	}
	public void set_iduser(String _iduser) {
		this._iduser = _iduser;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
}

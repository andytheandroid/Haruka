package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository  extends MongoRepository < Menu, String >  {
	
	public <T> void insert (T[] t);
	public List<Menu> findbyparamter(String parameter);

}

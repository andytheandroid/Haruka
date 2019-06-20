package com.carlos.FoodAppLogin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

	@Autowired
	private MenuRepositoryImpl userRepo;

	
	public Menu addmenu(Menu menu){
		return  userRepo.insert(menu);
		
	}


	public List<Menu> getMenuByIdRestaurant(String idrestaurant){
		return  userRepo.findbyparamter(idrestaurant);
		
	}
	
		
	
	
}

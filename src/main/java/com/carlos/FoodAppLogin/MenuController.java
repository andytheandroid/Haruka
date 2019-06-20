package com.carlos.FoodAppLogin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mongodb.DBObject;
import com.mongodb.util.JSON;

@RestController
public class MenuController {

	@Autowired
	public MenuService menuservice;
	
    @RequestMapping(value = "/addAllMenusToDB", method = RequestMethod.POST)
    public ResponseEntity<String> addAllMenusToDB(@RequestBody Menu menu){
    	
    	menuservice.addmenu(menu);
    	return ResponseEntity.ok("Registered");
    }

    @RequestMapping(value = "/getMenuByRestaurantId", method = RequestMethod.POST)

    public List<Menu> getMenuByRestaurantId(@RequestParam String idrestaurant){
    	
    	return menuservice.getMenuByIdRestaurant(idrestaurant);
    	
    }
    
    @RequestMapping(value = "/getMainDishes", method = RequestMethod.POST)

    public void getMainDishes(){
    	
    	final String uri = "https://www.themealdb.com/api/json/v1/1/filter.php?c=dessert";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        
        ResponseEntity<Meal> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, null, new ParameterizedTypeReference<Meal>() {
        });
        Meal pojoObjList = responseEntity.getBody();
        
        System.out.println(pojoObjList.strMeal);
    	
    	
    }
    
    
    

}

package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FondasController {


	@Autowired
	private FondasService service;
	
	  
    @RequestMapping(value = "/getfondas", method = RequestMethod.POST)
    public List<Fondas> getfondas(){
    	
    	return service.getFondas();
    }

    @RequestMapping(value = "/addfondas", method = RequestMethod.POST)
    public Fondas addfondas(@RequestBody Fondas fonda){
    	
    	return service.addFonda(fonda);
    }

    

}

package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentsController {
	
	@Autowired
	private CommentsService service;

	@PostMapping("/getComments")
    public List<Comments> getComments(@RequestParam String idfonda){
    	
    	return service.getComments(idfonda);
    }
    
   

    @RequestMapping(value = "/postComment", method = RequestMethod.POST)
    public ResponseEntity<String> addfondas(@RequestBody Comments comment){
         service.addComment(comment);
    	return ResponseEntity.ok("Registered");
    }

    


}

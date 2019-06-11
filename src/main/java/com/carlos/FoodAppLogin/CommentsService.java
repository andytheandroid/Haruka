package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CommentsService {
	
	@Autowired
	private CommentsRepositoryImpl userRepo;

	
	public List<Comments> getComments(String fondaId){
		
		return userRepo.findCommentsForTheCurrentFonda(fondaId);
		
	}
	
	public Comments addComment(Comments comment){
		return  userRepo.insert(comment);
		
	}
		

}

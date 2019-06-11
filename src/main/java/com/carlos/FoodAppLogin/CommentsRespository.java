package com.carlos.FoodAppLogin;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CommentsRespository extends  MongoRepository < Comments, String > {
	
	@Query("{ 'idfonda' : ?0 }")
	  List<Comments> findCommentsForTheCurrentFonda(String idfonda);

}

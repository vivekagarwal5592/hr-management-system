package techit.model.dao;

import java.util.List;

import techit.model.Sentiment;


public interface SentimentDao {
	
	
	// Get all the projects
		List<Sentiment> getAllSentiment();
		
		// Get a project by id
		Sentiment getSentimentById(int id);
		
		Sentiment saveSentiment(Sentiment sentiment);
		
		
		
}

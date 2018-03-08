package techit.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import techit.model.Project;
import techit.model.Sentiment;



@RestController
public class SentimentController {

	@Autowired
	private Sentiment SentimentDao;
	
	@RequestMapping(value = "/insertSentiment", method = RequestMethod.POST)
	public Sentiment insertSentiment(@RequestBody Sentiment sentiment) {
		//return SentimentDao.saveSentiment(sentiment);
		return null;
	}
	

	
	
	
}

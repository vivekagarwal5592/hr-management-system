package techit.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import techit.model.Sentiment;
import techit.model.User;
import techit.model.dao.UserDao;
import techit.model.dao.SentimentDao;

@RestController
public class SentimentController {

	@Autowired
	private SentimentDao SentimentDao;
	
	@RequestMapping(value = "/insertSentiment", method = RequestMethod.POST)
	public Sentiment insertSentiment(@RequestBody Sentiment sentiment) {
		return SentimentDao.saveSentiment(sentiment);
	}
	
	
	
	
}

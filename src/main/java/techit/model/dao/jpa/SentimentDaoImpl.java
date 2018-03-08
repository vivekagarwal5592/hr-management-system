package techit.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import techit.model.Sentiment;
import techit.model.dao.SentimentDao;



public class SentimentDaoImpl implements SentimentDao{
	@PersistenceContext
	   private EntityManager entityManager;
	
	@Override
	public List<Sentiment> getAllSentiment() {
		
		// TODO Auto-generated method stub
		return entityManager.createQuery( "from Sentiment order by id", Sentiment.class )
	            .getResultList();
		
	}

	@Override
	public Sentiment getSentimentById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Sentiment.class, id);
		
	
}

	@Override
	public void saveSentiment(Sentiment sentiment) {
		// TODO Auto-generated method stub
		entityManager.merge(sentiment);
		
		
	}
}

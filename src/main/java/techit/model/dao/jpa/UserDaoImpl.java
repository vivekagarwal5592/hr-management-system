package techit.model.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import techit.model.Supervisor;
import techit.model.User;
import techit.model.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
   
   @PersistenceContext
   private EntityManager entityManager;
   
   @Override
   @SuppressWarnings("unchecked")
   public <T extends User> T getUser(int id) {
      try {
         return (T) entityManager.find(User.class, id);
      }
      catch (NoResultException e) {
         return null;
      }
   }
   

   
   @Override
   public Supervisor getSupervisor(int id) {
      try {
         return entityManager.find(Supervisor.class, id);
      }
      catch (NoResultException e) {
         return null;
      }
   }
   
   @Override
   @SuppressWarnings("unchecked")
   public <T extends User> T getUserByLogin(String login) {
      try {
         return (T) entityManager.createQuery("from User where username = ?",
            User.class).setParameter(0, login).getSingleResult();
      }
      catch (NoResultException e) {
         return null;
      }
   }
   
   @Override
   @SuppressWarnings("unchecked")
   public <T extends User> T getUserByEmail(String email) {
      try {
         return (T) entityManager.createQuery("from User where email = ?",
            User.class).setParameter(0, email).getSingleResult();
      }
      catch (NoResultException e) {
         return null;
      }
   }
   
   @Override
   @SuppressWarnings("unchecked")
   public <T extends User> List<T> getUsers() {
      try {
         return (List<T>) entityManager.createQuery("from User order by id",
            User.class).getResultList();
      }
      catch (NoResultException e) {
         return null;
      }
   }
   
   @Override
   @Transactional
   public <T extends User> T saveUser(T user) {
      return entityManager.merge(user);
   }
}

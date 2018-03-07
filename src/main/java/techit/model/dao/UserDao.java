package techit.model.dao;

import java.util.List;


import techit.model.Supervisor;
import techit.model.User;

public interface UserDao {
   
   /**
    * getUser
    * 
    * @param id
    * @return
    */
   <T extends User> T getUser(int id);
   

     
   /**
    * getSupervisor
    * 
    * @param id
    * @return
    */
   Supervisor getSupervisor(int id);
   
   /**
    * getUserByLogin
    * 
    * @param login
    * @return
    */
   <T extends User> T getUserByLogin(String login);
   
   /**
    * getUserByEmail
    * 
    * @param email
    * @return
    */
   <T extends User> T getUserByEmail(String email);
   
   /**
    * getUsers
    * 
    * @return
    */
   <T extends User> List<T> getUsers();
   
   /**
    * saveUser
    * 
    * @param user
    * @return
    */
   <T extends User> T saveUser(T user);
}
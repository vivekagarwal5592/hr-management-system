package techit.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Supervisor
 */
@Entity
@DiscriminatorValue("2")
public class Employee extends User implements Serializable {
   
   private static final long serialVersionUID = 1L;
   
   public Employee() {
      super();
   }
}

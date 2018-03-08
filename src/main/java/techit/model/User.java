
package techit.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_role_id")
public abstract class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id; // GeneralUser's unique id
	@Column(name = "first_name")
	private String firstName; // GeneralUser's first name
	@Column(name = "last_name")
	private String lastName; // GeneralUser's last name
	@Column(name = "username")
	private String username; // Username and email are the same.
	@Column(name = "password")
	private String password;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "department")
	private String department;
	@Column(name = "email")
	private String email;
	@Column(name = "user_role_id", insertable = false, updatable = false)
	private Integer userRoleId; // default to low privilege user role

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinTable(name = "project_user", joinColumns = { @JoinColumn(name = "projectid") }, inverseJoinColumns = {
			@JoinColumn(name = "userid") })
	@JsonIgnore
	private Set<Project> projects;

	/**
	 * Returns the value of id
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of id
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Returns the value of firstName
	 * 
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the value of firstName
	 * 
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the value of lastName
	 * 
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the value of lastName
	 * 
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the value of username
	 * 
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the value of username
	 * 
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String userName) {
		this.username = userName;
	}

	/**
	 * Returns the value of password
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the value of password
	 * 
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Returns the value of phoneNumber
	 * 
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the value of phoneNumber
	 * 
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Returns the value of department
	 * 
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the value of department
	 * 
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Returns the value of email
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of email
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns the value of userRole
	 * 
	 * @return the userRole
	 */
	/*public UserRole getUserRole() {
		return userRoleId != null ? UserRole.valueOf(userRoleId) : null;
	}

	/**
	 * Sets the value of userRole
	 * 
	 * @param userRole
	 *            the userRole to set
	 */
	/*public void setUserRole(UserRole userRole) {
		if (userRole != null) {
			this.userRoleId = userRole.getValue();
		}
	}*/

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}

package techit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Project")
public class Project {

	@Id
	@GeneratedValue
	@Column(name = "id")
	Integer id;
	String name;

	 @OneToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "supervisor_id", referencedColumnName = "id")
	private User supervisor; // modifier user

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinTable(name = "project_user", joinColumns = { @JoinColumn(name = "userid") }, inverseJoinColumns = {
			@JoinColumn(name = "projectid") })
	@JsonIgnore
	private List<User> employees;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projectDetails")
	@JsonIgnore
	private List<Sentiment> sentiments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(User supervisor) {
		this.supervisor = supervisor;
	}

	public List<User> getEmployees() {
		return employees;
	}

	public void setEmployees(List<User> employees) {
		this.employees = employees;
	}

	public List<Sentiment> getSentiments() {
		return sentiments;
	}

	public void setSentiments(List<Sentiment> sentiments) {
		this.sentiments = sentiments;
	}
	
	

}

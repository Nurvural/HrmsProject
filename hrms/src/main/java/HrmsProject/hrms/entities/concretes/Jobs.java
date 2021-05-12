package HrmsProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jobs")
public class Jobs {
	
	@Id
	@GeneratedValue
	@Column(name="id")
    private int id;
	
	@Column(name="JobTitle")
	private String JobTitle;

	public Jobs() {
		
	}

	public Jobs(int id, String jobTitle) {
		super();
		this.id = id;
		this.JobTitle = jobTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.JobTitle = jobTitle;
	}
		
}

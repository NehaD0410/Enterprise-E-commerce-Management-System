package spring.project.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class CompanyResponce {
	@Id
	private int id;
	@OneToMany(targetEntity = CustomerQuery.class)
	private Set<CustomerQuery>cQueries;	
	private String msg;
	public CompanyResponce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyResponce(int id, Set<CustomerQuery> cQueries, String msg) {
		super();
		this.id = id;
		this.cQueries = cQueries;
		this.msg = msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<CustomerQuery> getcQueries() {
		return cQueries;
	}
	public void setcQueries(Set<CustomerQuery> cQueries) {
		this.cQueries = cQueries;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "CompanyResponce [id=" + id + ", cQueries=" + cQueries + ", msg=" + msg + "]";
	}
	
}

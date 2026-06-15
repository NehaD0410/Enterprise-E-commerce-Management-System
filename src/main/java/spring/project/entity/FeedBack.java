package spring.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class FeedBack {
	@Id
	private int id;
	@OneToMany(targetEntity = CustomerQuery.class)
	private List<CustomerQuery>customerQuerys;
	@OneToMany(targetEntity = CompanyResponce.class)
	private List<CompanyResponce>comanyresopnces;
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedBack(int id, List<CustomerQuery> customerQuerys, List<CompanyResponce> comanyresopnces) {
		super();
		this.id = id;
		this.customerQuerys = customerQuerys;
		this.comanyresopnces = comanyresopnces;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<CustomerQuery> getCustomerQuerys() {
		return customerQuerys;
	}
	public void setCustomerQuerys(List<CustomerQuery> customerQuerys) {
		this.customerQuerys = customerQuerys;
	}
	public List<CompanyResponce> getComanyresopnces() {
		return comanyresopnces;
	}
	public void setComanyresopnces(List<CompanyResponce> comanyresopnces) {
		this.comanyresopnces = comanyresopnces;
	}
	@Override
	public String toString() {
		return "FeedBack [id=" + id + ", customerQuerys=" + customerQuerys + ", comanyresopnces=" + comanyresopnces
				+ "]";
	}
	
}

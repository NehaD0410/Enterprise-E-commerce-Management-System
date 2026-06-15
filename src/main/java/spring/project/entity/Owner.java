package spring.project.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Owner {
	@Id
	private int id;
	private String name;
	private String adhar;
	private String panno;
	private String mailid;
	private double income;
	private String experience;
	private Date dob;
	private String mobileno;
	@OneToMany (targetEntity = Address.class)
	private List<Address>addresses;
	@OneToOne
	private Company company;
	@OneToMany(targetEntity = Manager.class)
	private List<Manager>managers;
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(int id, String name, String adhar, String panno, String mailid, double income, String experience,
			Date dob, String mobileno, List<Address> addresses, Company company, List<Manager> managers) {
		super();
		this.id = id;
		this.name = name;
		this.adhar = adhar;
		this.panno = panno;
		this.mailid = mailid;
		this.income = income;
		this.experience = experience;
		this.dob = dob;
		this.mobileno = mobileno;
		this.addresses = addresses;
		this.company = company;
		this.managers = managers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdhar() {
		return adhar;
	}
	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", adhar=" + adhar + ", panno=" + panno + ", mailid=" + mailid
				+ ", income=" + income + ", experience=" + experience + ", dob=" + dob + ", mobileno=" + mobileno
				+ ", addresses=" + addresses + ", company=" + company + ", managers=" + managers + "]";
	}
	
}

package spring.project.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Manager {
	@Id
	private int id;
	private String name;
	private String adhar;
	private String panno;
	private String mailid;
	private String experience;
	private float salary;
	private Date dob;
	private Date doj;
	private String mobileno;
	@ManyToOne
	private Company company;
	@ManyToOne
	private Dept dept;
	@OneToMany(targetEntity = Address.class)
	private List<Address>addresses;
	@OneToMany(targetEntity = Employee.class)
	private List<Employee> employee;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int id, String name, String adhar, String panno, String mailid, String experience, float salary,
			Date dob, Date doj, String mobileno, Company company, Dept dept, List<Address> addresses,
			List<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.adhar = adhar;
		this.panno = panno;
		this.mailid = mailid;
		this.experience = experience;
		this.salary = salary;
		this.dob = dob;
		this.doj = doj;
		this.mobileno = mobileno;
		this.company = company;
		this.dept = dept;
		this.addresses = addresses;
		this.employee = employee;
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
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", adhar=" + adhar + ", panno=" + panno + ", mailid=" + mailid
				+ ", experience=" + experience + ", salary=" + salary + ", dob=" + dob + ", doj=" + doj + ", mobileno="
				+ mobileno + ", company=" + company + ", dept=" + dept + ", addresses=" + addresses + ", employee="
				+ employee + "]";
	}
	
}

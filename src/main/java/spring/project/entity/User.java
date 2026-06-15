package spring.project.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String adhar;
	private String panno;
	private String mailid;
	private String  mobileno;
	private Date dob;
	@OneToMany(targetEntity = Address.class)
	private List<Address>addresses;
	@OneToOne
	private Role role;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String adhar, String panno, String mailid, String mobileno, Date dob,
			List<Address> addresses, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.adhar = adhar;
		this.panno = panno;
		this.mailid = mailid;
		this.mobileno = mobileno;
		this.dob = dob;
		this.addresses = addresses;
		this.role = role;
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
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", adhar=" + adhar + ", panno=" + panno + ", mailid=" + mailid
				+ ", mobileno=" + mobileno + ", dob=" + dob + ", addresses=" + addresses + ", role=" + role + "]";
	}
}

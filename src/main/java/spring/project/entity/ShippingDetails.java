package spring.project.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class ShippingDetails {
	@Id
	private int sid;
	@ManyToMany(targetEntity = User.class)
	private Set User;
	public ShippingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShippingDetails(int sid, Set user) {
		super();
		this.sid = sid;
		User = user;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Set getUser() {
		return User;
	}
	public void setUser(Set user) {
		User = user;
	}
	@Override
	public String toString() {
		return "ShippingDetails [sid=" + sid + ", User=" + User + "]";
	}
	
}

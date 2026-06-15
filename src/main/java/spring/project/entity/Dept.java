package spring.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Dept {
	@Id
	private int did;
	private String name;
	@OneToOne
	private Manager manager;
	@OneToMany(targetEntity = Employee.class)
	private List<Employee>employees;
	@OneToOne
	private Admin admin;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int did, String name, Manager manager, List<Employee> employees, Admin admin) {
		super();
		this.did = did;
		this.name = name;
		this.manager = manager;
		this.employees = employees;
		this.admin = admin;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + ", manager=" + manager + ", employees=" + employees + ", admin="
				+ admin + "]";
	}
	
}

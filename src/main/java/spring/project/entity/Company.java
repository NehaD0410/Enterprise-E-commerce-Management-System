package spring.project.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Company {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regno;
	private String name;
	@OneToMany(targetEntity = Address.class)
	private List<Address>addresses;
	@OneToOne
	private Owner owner;
	@OneToMany(targetEntity = Manager.class)
	private List<Manager>managers;
	@OneToMany(targetEntity = Admin.class)
	private List<Admin>admins;
	@OneToMany
	private List<Employee>employees;
	@OneToMany(targetEntity = Dept.class)
	private List<Dept>depts;
	@OneToMany
	private List<Type>types;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int regno, String name, List<Address> addresses, Owner owner, List<Manager> managers,
			List<Admin> admins, List<Employee> employees, List<Dept> depts, List<Type> types) {
		super();
		this.regno = regno;
		this.name = name;
		this.addresses = addresses;
		this.owner = owner;
		this.managers = managers;
		this.admins = admins;
		this.employees = employees;
		this.depts = depts;
		this.types = types;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	@Override
	public String toString() {
		return "Company [regno=" + regno + ", name=" + name + ", addresses=" + addresses + ", owner=" + owner
				+ ", managers=" + managers + ", admins=" + admins + ", employees=" + employees + ", depts=" + depts
				+ ", types=" + types + "]";
	}
	
}

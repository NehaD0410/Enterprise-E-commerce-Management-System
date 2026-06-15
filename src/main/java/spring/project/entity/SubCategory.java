package spring.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class SubCategory {
	@Id
	private int id;
	private String name;
	@OneToMany(targetEntity = District.class)
	private List<District>districts;
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SubCategory(int id, String name, List<District> districts) {
		super();
		this.id = id;
		this.name = name;
		this.districts = districts;
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
	public List<District> getDistricts() {
		return districts;
	}
	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}
	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", name=" + name + ", districts=" + districts + "]";
	}
}

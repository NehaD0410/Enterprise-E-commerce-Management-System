package spring.project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class State {
	@Id
	private int id;
	private String name;
	@OneToMany(targetEntity = District.class)
	@JsonIgnore
	private List<District> districts;

	public State() {
		super();
		// TODO Auto-generated constructor stub
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

	public State(int id, String name, List<District> districts) {
		super();
		this.id = id;
		this.name = name;
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", districts=" + districts + "]";
	}
}

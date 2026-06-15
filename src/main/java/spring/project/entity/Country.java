package spring.project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Country {
	@Id
	private int id;
	private String name;
	@OneToMany(targetEntity = State.class)
	@JsonIgnore
	private List<State> states;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int id, String name, List<State> states) {
		super();
		this.id = id;
		this.name = name;
		this.states = states;
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

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", states=" + states + "]";
	}

}

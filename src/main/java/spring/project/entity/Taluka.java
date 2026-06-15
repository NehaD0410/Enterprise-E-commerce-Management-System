package spring.project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Taluka {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String name;
	@OneToMany(targetEntity = Town.class)
	@JsonIgnore
	private List<Town> towns;

	public Taluka() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Taluka(int tid, String name, List<Town> towns) {
		super();
		this.tid = tid;
		this.name = name;
		this.towns = towns;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Town> getTowns() {
		return towns;
	}

	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}

	@Override
	public String toString() {
		return "Taluka [tid=" + tid + ", name=" + name + ", towns=" + towns + "]";
	}
}

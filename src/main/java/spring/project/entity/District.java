package spring.project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class District {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(targetEntity = Taluka.class)
	@JsonIgnore
	private List<Taluka> talukas;

	public District() {
		super();
		// TODO Auto-generated constructor stub
	}

	public District(int id, String name, List<Taluka> talukas) {
		super();
		this.id = id;
		this.name = name;
		this.talukas = talukas;
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

	public List<Taluka> getTalukas() {
		return talukas;
	}

	public void setTalukas(List<Taluka> talukas) {
		this.talukas = talukas;
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", talukas=" + talukas + "]";
	}

}

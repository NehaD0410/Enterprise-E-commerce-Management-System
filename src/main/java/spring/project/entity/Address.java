package spring.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	private int flatno;
	private String area;
	@OneToOne
	private Town town;
	@OneToOne
	private Taluka taluka;
	@OneToOne
	private District district;
	@OneToOne
	private State state;
	@OneToOne
	private Country country;
	private int pincode;
	@Override
	public String toString() {
		return "Address [flatno=" + flatno + ", area=" + area + ", town=" + town + ", taluka=" + taluka + ", district="
				+ district + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	public Address(int flatno, String area, Town town, Taluka taluka, District district, State state, Country country,
			int pincode) {
		super();
		this.flatno = flatno;
		this.area = area;
		this.town = town;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFlatno() {
		return flatno;
	}
	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
	public Taluka getTaluka() {
		return taluka;
	}
	public void setTaluka(Taluka taluka) {
		this.taluka = taluka;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}

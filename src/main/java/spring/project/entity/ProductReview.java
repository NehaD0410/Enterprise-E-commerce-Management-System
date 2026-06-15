package spring.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ProductReview {
	@Id
	private int prid;
	private String name;
	@OneToOne
	private Product product;
	@Override
	public String toString() {
		return "ProductReview [prid=" + prid + ", name=" + name + ", product=" + product + "]";
	}
	public int getPrid() {
		return prid;
	}
	public void setPrid(int prid) {
		this.prid = prid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductReview(int prid, String name, Product product) {
		super();
		this.prid = prid;
		this.name = name;
		this.product = product;
	}
	public ProductReview() {
		super();
		// TODO Auto-generated constructor stub
	}
}

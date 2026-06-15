package spring.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Brand {
	@Id
	private int bid;
	private String name;
	@OneToMany(targetEntity = Product.class)
	private List<Product>products;
	@ManyToOne(targetEntity = Category.class)
	private Category category;
	@OneToMany(targetEntity = SubCategory.class)
	private List<SubCategory>subCategories;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int bid, String name, List<Product> products, Category category, List<SubCategory> subCategories) {
		super();
		this.bid = bid;
		this.name = name;
		this.products = products;
		this.category = category;
		this.subCategories = subCategories;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", name=" + name + ", products=" + products + ", category=" + category
				+ ", subCategories=" + subCategories + "]";
	}
	
}

package spring.project.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	@OneToMany(targetEntity = SubCategory.class)
	private List<SubCategory>subCategories;
	@OneToMany(targetEntity = Product.class)
	private List<Product>products;
	@OneToMany(targetEntity = Brand.class)
	private List<Brand>brands;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}
	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Brand> getBrands() {
		return brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}
	public Category(int cid, String name, List<SubCategory> subCategories, List<Product> products, List<Brand> brands) {
		super();
		this.cid = cid;
		this.name = name;
		this.subCategories = subCategories;
		this.products = products;
		this.brands = brands;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [cid=" + cid + ", name=" + name + ", subCategories=" + subCategories + ", products=" + products
				+ ", brands=" + brands + "]";
	}
}

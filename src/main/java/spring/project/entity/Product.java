package spring.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Product {
	@Id
	private int pid;
	private String name;
	@OneToMany(targetEntity = Brand.class)
	private List<Brand>brands;
	private float price;
	@OneToOne
	private Category category;
	@OneToMany(targetEntity = ProductReview.class)
	private List<ProductReview>productReviews;
	public Product(int pid, String name, List<Brand> brands, float price, Category category,
			List<ProductReview> productReviews) {
		super();
		this.pid = pid;
		this.name = name;
		this.brands = brands;
		this.price = price;
		this.category = category;
		this.productReviews = productReviews;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Brand> getBrands() {
		return brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<ProductReview> getProductReviews() {
		return productReviews;
	}
	public void setProductReviews(List<ProductReview> productReviews) {
		this.productReviews = productReviews;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", brands=" + brands + ", price=" + price + ", category="
				+ category + ", productReviews=" + productReviews + "]";
	}
}

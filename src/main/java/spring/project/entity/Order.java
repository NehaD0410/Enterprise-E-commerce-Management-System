package spring.project.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	private int oid;
	private String name;
	@ManyToMany(targetEntity = Product.class)
	private List<Product>products;
	@ManyToOne
	private PaymentMode paymentmode;
	@ManyToMany(targetEntity = ShippingDetails.class)
	private Set<ShippingDetails>shippingDetails;
	@ManyToMany(targetEntity = Invoice.class)
	private Set<Invoice>invoices;
	@ManyToMany(targetEntity = Tracking.class)
	private Set<Tracking>trackings;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int oid, String name, List<Product> products, PaymentMode paymentmode,
			Set<ShippingDetails> shippingDetails, Set<Invoice> invoices, Set<Tracking> trackings) {
		super();
		this.oid = oid;
		this.name = name;
		this.products = products;
		this.paymentmode = paymentmode;
		this.shippingDetails = shippingDetails;
		this.invoices = invoices;
		this.trackings = trackings;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
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
	public PaymentMode getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(PaymentMode paymentmode) {
		this.paymentmode = paymentmode;
	}
	public Set<ShippingDetails> getShippingDetails() {
		return shippingDetails;
	}
	public void setShippingDetails(Set<ShippingDetails> shippingDetails) {
		this.shippingDetails = shippingDetails;
	}
	public Set<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}
	public Set<Tracking> getTrackings() {
		return trackings;
	}
	public void setTrackings(Set<Tracking> trackings) {
		this.trackings = trackings;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", name=" + name + ", products=" + products + ", paymentmode=" + paymentmode
				+ ", shippingDetails=" + shippingDetails + ", invoices=" + invoices + ", trackings=" + trackings + "]";
	}
	
}

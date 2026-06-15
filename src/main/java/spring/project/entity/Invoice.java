package spring.project.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Invoice {
	@Id
	private int iid;
	@OneToMany(targetEntity=Product.class)
	private List<Product>product;
	@ManyToOne(targetEntity=PaymentMode.class)
	private PaymentMode paymentmode;
	@ManyToMany(targetEntity=ShippingDetails.class)
	private Set Shippingdetails;
	@OneToOne(targetEntity=Tracking.class)
	private Tracking tracking;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int iid, List<Product> product, PaymentMode paymentmode, Set shippingdetails, Tracking tracking) {
		super();
		this.iid = iid;
		this.product = product;
		this.paymentmode = paymentmode;
		Shippingdetails = shippingdetails;
		this.tracking = tracking;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public PaymentMode getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(PaymentMode paymentmode) {
		this.paymentmode = paymentmode;
	}
	public Set getShippingdetails() {
		return Shippingdetails;
	}
	public void setShippingdetails(Set shippingdetails) {
		Shippingdetails = shippingdetails;
	}
	public Tracking getTracking() {
		return tracking;
	}
	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}
	@Override
	public String toString() {
		return "Invoice [iid=" + iid + ", product=" + product + ", paymentmode=" + paymentmode + ", Shippingdetails="
				+ Shippingdetails + ", tracking=" + tracking + "]";
	}
}

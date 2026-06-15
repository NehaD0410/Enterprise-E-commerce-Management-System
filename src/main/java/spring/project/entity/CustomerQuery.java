package spring.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CustomerQuery {
	@Id
	private int id;
	@OneToOne
	private ShippingDetails shippingDetails;
	@OneToOne
	private Invoice invoice;
	public CustomerQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerQuery(int id, ShippingDetails shippingDetails, Invoice invoice) {
		super();
		this.id = id;
		this.shippingDetails = shippingDetails;
		this.invoice = invoice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ShippingDetails getShippingDetails() {
		return shippingDetails;
	}
	public void setShippingDetails(ShippingDetails shippingDetails) {
		this.shippingDetails = shippingDetails;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	@Override
	public String toString() {
		return "CustomerQuery [id=" + id + ", shippingDetails=" + shippingDetails + ", invoice=" + invoice + "]";
	}
	
}

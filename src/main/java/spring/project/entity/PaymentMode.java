package spring.project.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class PaymentMode {
	@Id
	private int pmid;
		@OneToOne
	private Cod cod;
		@OneToOne
	private Upi upi;
		@OneToOne
	private Card card;
	private Date dateofDatepayment;
	private boolean status;
	public PaymentMode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentMode(int pmid, Cod cod, Upi upi, Card card, Date dateofDatepayment, boolean status) {
		super();
		this.pmid = pmid;
		this.cod = cod;
		this.upi = upi;
		this.card = card;
		this.dateofDatepayment = dateofDatepayment;
		this.status = status;
	}
	public int getPmid() {
		return pmid;
	}
	public void setPmid(int pmid) {
		this.pmid = pmid;
	}
	public Cod getCod() {
		return cod;
	}
	public void setCod(Cod cod) {
		this.cod = cod;
	}
	public Upi getUpi() {
		return upi;
	}
	public void setUpi(Upi upi) {
		this.upi = upi;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public Date getDateofDatepayment() {
		return dateofDatepayment;
	}
	public void setDateofDatepayment(Date dateofDatepayment) {
		this.dateofDatepayment = dateofDatepayment;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PaymentMode [pmid=" + pmid + ", cod=" + cod + ", upi=" + upi + ", card=" + card + ", dateofDatepayment="
				+ dateofDatepayment + ", status=" + status + "]";
	}
	
}

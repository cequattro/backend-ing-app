package pe.globalhub.rest.db;

public class account {
	
	private int accointid;
	private String iban;
	private double overallbalance;
	private String producttype;
	private String currency;
	public int getAccointid() {
		return accointid;
	}
	public void setAccointid(int accointid) {
		this.accointid = accointid;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public double getOverallbalance() {
		return overallbalance;
	}
	public void setOverallbalance(double overallbalance) {
		this.overallbalance = overallbalance;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "account [accointid=" + accointid + ", iban=" + iban
				+ ", overallbalance=" + overallbalance + ", producttype="
				+ producttype + ", currency=" + currency + "]";
	}
	
	
	
}

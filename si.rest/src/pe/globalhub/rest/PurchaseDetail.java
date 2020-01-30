package pe.globalhub.rest;

public class PurchaseDetail {
	
	//private String purchaseCode;
	private int productCode;
	private int productQty;
	private double productCurrentPrice;
	/*public String getPurchaseCode() {
		return purchaseCode;
	}
	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
	}*/
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public double getProductCurrentPrice() {
		return productCurrentPrice;
	}
	public void setProductCurrentPrice(double productCurrentPrice) {
		this.productCurrentPrice = productCurrentPrice;
	}
	//public PurchaseDetail(String purchaseCode, int productCode, int productQty,
	public PurchaseDetail(int productCode, int productQty,
			double productCurrentPrice) {
		super();
		//this.purchaseCode = purchaseCode;
		this.productCode = productCode;
		this.productQty = productQty;
		this.productCurrentPrice = productCurrentPrice;
	}
	public PurchaseDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PurchaseDetail"// [purchaseCode=" + purchaseCode
				+ ", productCode=" + productCode + ", productQty=" + productQty
				+ ", productCurrentPrice=" + productCurrentPrice + "]";
	}
	
	
	
	
}

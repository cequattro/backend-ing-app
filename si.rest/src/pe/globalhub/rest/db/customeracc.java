package pe.globalhub.rest.db;

public class customeracc {
	
	private int id;
	private int UUIDCustomer;
	private int accointid;
	private String holdertype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUUIDCustomer() {
		return UUIDCustomer;
	}
	public void setUUIDCustomer(int uUIDCustomer) {
		UUIDCustomer = uUIDCustomer;
	}
	public int getAccointid() {
		return accointid;
	}
	public void setAccointid(int accointid) {
		this.accointid = accointid;
	}
	public String getHoldertype() {
		return holdertype;
	}
	public void setHoldertype(String holdertype) {
		this.holdertype = holdertype;
	}
	@Override
	public String toString() {
		return "customeracc [id=" + id + ", UUIDCustomer=" + UUIDCustomer
				+ ", accointid=" + accointid + ", holdertype=" + holdertype
				+ "]";
	}
	
	

}

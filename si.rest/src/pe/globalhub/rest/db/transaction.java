package pe.globalhub.rest.db;

import java.util.Date;

public class transaction {
	
	private int transactionid;
	private int orderedby;
	private int amount;
	private int originaccountid;
	private int destinationaccountid;
	private Date executiondate;
	private Date orderdate;
	private String description;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public int getOrderedby() {
		return orderedby;
	}
	public void setOrderedby(int orderedby) {
		this.orderedby = orderedby;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getOriginaccountid() {
		return originaccountid;
	}
	public void setOriginaccountid(int originaccountid) {
		this.originaccountid = originaccountid;
	}
	public int getDestinationaccountid() {
		return destinationaccountid;
	}
	public void setDestinationaccountid(int destinationaccountid) {
		this.destinationaccountid = destinationaccountid;
	}
	public Date getExecutiondate() {
		return executiondate;
	}
	public void setExecutiondate(Date executiondate) {
		this.executiondate = executiondate;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "transaction [transactionid=" + transactionid + ", orderedby="
				+ orderedby + ", amount=" + amount + ", originaccountid="
				+ originaccountid + ", destinationaccountid="
				+ destinationaccountid + ", executiondate=" + executiondate
				+ ", orderdate=" + orderdate + ", description=" + description
				+ "]";
	}

}

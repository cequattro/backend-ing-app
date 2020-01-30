/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.globalhub.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author wcastro
 */
public class objeto {
	
	
	
    //añadir ciudad destino
	/*private String purchaseCode="0011"+System.currentTimeMillis();
	private String customerCode="0011";
	private String nombreCliente="Zancho Guasumba";
	private Long dateTrx=System.currentTimeMillis();
	private Date date=new Date(dateTrx);
	private String address="Calle Valdavia 23";
	private String district="Valencia";
	private String country="Spain";
    private List<PurchaseDetail> list = new ArrayList<PurchaseDetail>() {
      {
            add(new PurchaseDetail(purchaseCode,1,1,1.3));
            add(new PurchaseDetail(purchaseCode,2,1,2.5));
            add(new PurchaseDetail(purchaseCode,3,1,4.5));
            add(new PurchaseDetail(purchaseCode,6,1,1.6));
            add(new PurchaseDetail(purchaseCode,7,1,1.9));
            add(new PurchaseDetail(purchaseCode,11,1,10));
            add(new PurchaseDetail(purchaseCode,13,1,15));
      }
    };*/
	/*
	 private String purchaseCode="0012"+System.currentTimeMillis();
	private String customerCode="C"+System.currentTimeMillis();
	private String nombreCliente=possibleNames[rn]+" "+possibleLastname[rln];
	private Long dateTrx=System.currentTimeMillis();
	private Date date=new Date(dateTrx);
	private String address="Calle "+possibleDistricts[rln]+" "+rd;
	private String district=possibleDistricts[rd];
	 * */
	private String purchaseCode="0012"+System.currentTimeMillis()+utilRnd.cont();
	private String customerCode="C"+System.currentTimeMillis()+utilRnd.actual();
	private String nombreCliente=utilRnd.name()+" "+utilRnd.lastName();
	private Long dateTrx=System.currentTimeMillis();
	private Date date=new Date(dateTrx);
	private String address="Calle "+utilRnd.calle()+" "+utilRnd.nroCalle();
	private String district=utilRnd.district();
	private String country="Spain";
    private List<PurchaseDetail> list = new ArrayList<PurchaseDetail>() {
      {
    	for(int i=0; i<utilRnd.itemNumber();++i)
  		{
  			//add(new PurchaseDetail(purchaseCode,utilRnd.codProd(),utilRnd.qty(),utilRnd.price()));
  			add(new PurchaseDetail(utilRnd.codProd(),utilRnd.qty(),utilRnd.price()));
  		}  
      }
    };
	public String getPurchaseCode() {
		return purchaseCode;
	}
	public void setPurchaseCode(String purchaseCode) {
		this.purchaseCode = purchaseCode;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Long getDateTrx() {
		return dateTrx;
	}
	public void setDateTrx(Long dateTrx) {
		this.dateTrx = dateTrx;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<PurchaseDetail> getList() {
		/*for(int i=0; i<utilRnd.itemNumber();++i)
		{
			list.add(new PurchaseDetail(purchaseCode,utilRnd.codProd(),utilRnd.qty(),utilRnd.price()));
		}*/
		
		return list;
	}
	public void setList(List<PurchaseDetail> list) {
		this.list = list;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "objeto [purchaseCode=" + purchaseCode + ", customerCode="
				+ customerCode + ", nombreCliente=" + nombreCliente
				+ ", dateTrx=" + dateTrx + ", date=" + date + ", list=" + list
				+ "]";
	}        


  
    
}

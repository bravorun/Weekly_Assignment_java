package com.day_3.Q2;

public class Invoice implements Payable {
	int invoiceNo;
	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	

	public String getPartNum() {
		return partNum;
	}


	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPricePerItem() {
		return pricePerItem;
	}


	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}


	public Invoice(int invoiceNo,String partNum, String partDescription, int quantity, double pricePerItem) {
		this.invoiceNo=invoiceNo;
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}


	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	


	@Override
	public String toString() {
		return "Invoice [invoiceNo=" + invoiceNo + ", partNum=" + partNum + ", partDescription=" + partDescription
				+ ", quantity=" + quantity + ", pricePerItem=" + pricePerItem + "]";
	}


	@Override
	public double getPayment() {
		
		return quantity*pricePerItem;
	}


	
	

}

package com.univercellmobiles.app.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONESTOCK")
public class PhoneStock {
	@GeneratedValue
	@Id
	private int id;
	private String phModel;
	private String imeiNo;
	private Float dp;
	private Float sp;
	private Float bp;
	private Date arrivalDate;
	private Float margin;
	private String description;
	private String offer;

	private String place;
	private String invoiceNo;
	private String distributor;
	private int available;
	
	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}


	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	/**
	 * @return the phModel
	 */
	public String getPhModel() {
		return phModel;
	}

	/**
	 * @param phModel
	 *            the phModel to set
	 */
	public void setPhModel(String phModel) {
		this.phModel = phModel;
	}

	/**
	 * @return the imeiNo
	 */
	public String getImeiNo() {
		return imeiNo;
	}

	/**
	 * @param imeiNo
	 *            the imeiNo to set
	 */
	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	/**
	 * @return the dp
	 */
	public Float getDp() {
		return dp;
	}

	/**
	 * @param dp
	 *            the dp to set
	 */
	public void setDp(Float dp) {
		this.dp = dp;
	}

	/**
	 * @return the sp
	 */
	public Float getSp() {
		return sp;
	}

	/**
	 * @param sp
	 *            the sp to set
	 */
	public void setSp(Float sp) {
		this.sp = sp;
	}

	

	/**
	 * @return the margin
	 */
	public Float getMargin() {
		return margin;
	}

	/**
	 * @param margin
	 *            the margin to set
	 */
	public void setMargin(Float margin) {
		this.margin = margin;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PhoneStock [id=" + id + ", phStockId=" +  ", phModel=" + phModel + ", imeiNo=" + imeiNo + ", dp=" + dp
				+ ", sp=" + sp + ", soldDate=" + distributor + ", margin="
				+ margin + ", description=" + description + "]";
	}

	public Float getBp() {
		return bp;
	}

	public void setBp(Float bp) {
		this.bp = bp;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

}

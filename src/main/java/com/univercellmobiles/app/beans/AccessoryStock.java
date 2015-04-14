package com.univercellmobiles.app.beans;


import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCESSORYSTOCK")
public class AccessoryStock {  

	
	@Id
	private String accStockId;
	private Date arrivalDate;
	
	private String accModel;
	private String phmodelName;
	private Date soldDate;
	private String desription;
	private String margin;
	private Float dp;
	private Float sp;
	
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getSoldDate() {
		return soldDate;
	}
	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}
	/**
	 * @return the accStockId
	 */
	public String getAccStockId() {
		return accStockId;
	}
	/**
	 * @param accStockId the accStockId to set
	 */
	public void setAccStockId(String accStockId) {
		this.accStockId = accStockId;
	}
	/**
	 * @return the arrivalDate
	 */
	/*public Timestamp getArrivalDate() {
		return arrivalDate;
	}
	*//**
	 * @param arrivalDate the arrivalDate to set
	 *//*
	public void setArrivalDate(Timestamp arrivalDate) {
		this.arrivalDate = arrivalDate;
	}*/
	/**
	 * @return the accModel
	 */
	public String getAccModel() {
		return accModel;
	}
	/**
	 * @param accModel the accModel to set
	 */
	public void setAccModel(String accModel) {
		this.accModel = accModel;
	}
	/**
	 * @return the phmodelName
	 */
	public String getPhmodelName() {
		return phmodelName;
	}
	
	public String getDesription() {
		return desription;
	}
	public void setDesription(String desription) {
		this.desription = desription;
	}
	/**
	 * @param phmodelName the phmodelName to set
	 */
	public void setPhmodelName(String phmodelName) {
		this.phmodelName = phmodelName;
	}
	/**
	 * @return the soldDate
	 */
	
	/*public Timestamp getSoldDate() {
		return soldDate;
	}
	*//**
	 * @param soldDate the soldDate to set
	 *//*
	public void setSoldDate(Timestamp soldDate) {
		this.soldDate = soldDate;
	}*/
	/**
	 * @return the desc
	 */
	
	/**
	 * @return the margin
	 */
	public String getMargin() {
		return margin;
	}
	/**
	 * @param margin the margin to set
	 */
	public void setMargin(String margin) {
		this.margin = margin;
	}
	/**
	 * @return the dp
	 */
	public Float getDp() {
		return dp;
	}
	/**
	 * @param dp the dp to set
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
	 * @param sp the sp to set
	 */
	public void setSp(Float sp) {
		this.sp = sp;
	}
	@Override
	public String toString() {
		return "AccessoryStock [accStockId=" + accStockId + ", accModel="
				+ accModel + ", phmodelName=" + phmodelName + ", desription="
				+ desription + ", margin=" + margin + ", dp=" + dp + ", sp="
				+ sp + "]";
	}
	
	
	
}

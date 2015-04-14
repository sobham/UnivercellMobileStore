package com.univercellmobiles.app.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DISTRIBUTOR")
public class Distributor {
	@Id
	private String distId;
	private String distName;
	private String distLocation;
	private Date deliveryTime;
	/**
	 * @return the distId
	 */
	public String getDistId() {
		return distId;
	}
	/**
	 * @param distId the distId to set
	 */
	public void setDistId(String distId) {
		this.distId = distId;
	}
	/**
	 * @return the distName
	 */
	public String getDistName() {
		return distName;
	}
	/**
	 * @param distName the distName to set
	 */
	public void setDistName(String distName) {
		this.distName = distName;
	}
	/**
	 * @return the distLocation
	 */
	public String getDistLocation() {
		return distLocation;
	}
	/**
	 * @param distLocation the distLocation to set
	 */
	public void setDistLocation(String distLocation) {
		this.distLocation = distLocation;
	}
	/**
	 * @return the deliveryTime
	 */
	public Date getDeliveryTime() {
		return deliveryTime;
	}
	/**
	 * @param deliveryTime the deliveryTime to set
	 */
	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Distributor [distId=" + distId + ", distName=" + distName
				+ ", distLocation=" + distLocation + ", deliveryTime="
				+ deliveryTime + "]";
	}
	
	
	
	
}

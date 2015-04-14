package com.univercellmobiles.app.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ACCMODEL")
public class AccModel {
	
	@Id
	private String accModelId;
	private String modelName;
	private String phoneModel;
	private String satus;
	private String brandId;
	/**
	 * @return the accModelId
	 */
	public String getAccModelId() {
		return accModelId;
	}
	/**
	 * @param accModelId the accModelId to set
	 */
	public void setAccModelId(String accModelId) {
		this.accModelId = accModelId;
	}
	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}
	/**
	 * @param modelName the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	/**
	 * @return the phoneModel
	 */
	public String getPhoneModel() {
		return phoneModel;
	}
	/**
	 * @param phoneModel the phoneModel to set
	 */
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	/**
	 * @return the satus
	 */
	public String getSatus() {
		return satus;
	}
	/**
	 * @param satus the satus to set
	 */
	public void setSatus(String satus) {
		this.satus = satus;
	}
	/**
	 * @return the brandId
	 */
	public String getBrandId() {
		return brandId;
	}
	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccModel [accModelId=" + accModelId + ", modelName="
				+ modelName + ", phoneModel=" + phoneModel + ", satus=" + satus
				+ ", brandId=" + brandId + "]";
	}
	
	
	
	
}

package com.univercellmobiles.app.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONEMODEL")
public class PhoneModel { 
	@Id
	@GeneratedValue
	private int id;
	private String modelName;
	private String brandName;
	private int prdCode;
	private String launch;
	private String body;
	private String display;
	private String platform;
	private String memory;
	private String sound;
	private String comms;
	private String features;
	private String battery;
	private String misc;
	private String camera;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * @param modelName
	 *            the modelName to set
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	
	/**
	 * @return the launch
	 */
	public String getLaunch() {
		return launch;
	}

	/**
	 * @param launch
	 *            the launch to set
	 */
	public void setLaunch(String launch) {
		this.launch = launch;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the display
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * @param display
	 *            the display to set
	 */
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform
	 *            the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * @return the memory
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * @param memory
	 *            the memory to set
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound
	 *            the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * @return the comms
	 */
	public String getComms() {
		return comms;
	}

	/**
	 * @param comms
	 *            the comms to set
	 */
	public void setComms(String comms) {
		this.comms = comms;
	}

	/**
	 * @return the features
	 */
	public String getFeatures() {
		return features;
	}

	/**
	 * @param features
	 *            the features to set
	 */
	public void setFeatures(String features) {
		this.features = features;
	}

	/**
	 * @return the battery
	 */
	public String getBattery() {
		return battery;
	}

	/**
	 * @param battery
	 *            the battery to set
	 */
	public void setBattery(String battery) {
		this.battery = battery;
	}

	/**
	 * @return the misc
	 */
	public String getMisc() {
		return misc;
	}

	/**
	 * @param misc
	 *            the misc to set
	 */
	public void setMisc(String misc) {
		this.misc = misc;
	}

	/**
	 * @return the camera
	 */
	public String getCamera() {
		return camera;
	}

	/**
	 * @param camera
	 *            the camera to set
	 */
	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrdCode() {
		return prdCode;
	}

	public void setPrdCode(int prdCode) {
		this.prdCode = prdCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PhoneModel [modelName=" + modelName + ", brandId=" +  ", launch=" + launch + ", body=" + body + ", display="
				+ display + ", platform=" + platform + ", memory=" + memory
				+ ", sound=" + sound + ", comms=" + comms + ", features="
				+ features + ", battery=" + battery + ", misc=" + misc
				+ ", camera=" + camera + "]";
	}

}

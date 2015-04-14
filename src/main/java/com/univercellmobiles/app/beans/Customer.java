package com.univercellmobiles.app.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMER")
public class Customer {

	private Long custPhone;
	@Id
	private String custId;
	private String custRating;
	private String custDetails;
	private String custName;
/**
 * @return the custPhone
 */
public Long getCustPhone() {
	return custPhone;
}
/**
 * @param custPhone the custPhone to set
 */
public void setCustPhone(Long custPhone) {
	this.custPhone = custPhone;
}
/**
 * @return the custId
 */

public String getCustId() {
	return custId;
}
/**
 * @param custId the custId to set
 */
public void setCustId(String custId) {
	this.custId = custId;
}
/**
 * @return the custRating
 */
public String getCustRating() {
	return custRating;
}
/**
 * @param custRating the custRating to set
 */
public void setCustRating(String custRating) {
	this.custRating = custRating;
}
/**
 * @return the custDetails
 */
public String getCustDetails() {
	return custDetails;
}
/**
 * @param custDetails the custDetails to set
 */
public void setCustDetails(String custDetails) {
	this.custDetails = custDetails;
}
/**
 * @return the custName
 */
public String getCustName() {
	return custName;
}
/**
 * @param custName the custName to set
 */
public void setCustName(String custName) {
	this.custName = custName;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Customer [custPhone=" + custPhone + ", custId=" + custId
			+ ", custRating=" + custRating + ", custDetails=" + custDetails
			+ ", custName=" + custName + "]";
}



}

/**
 * 
 */
package com.trial.entities;

import java.io.Serializable;
import java.util.Date;


/**
 * @author z078713
 *
 */
public class Offer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String title;
	private String promoOfrId;
	private String discountType;
	private Double discountAmount;
	private String subTitle;
	private String status;
	private String expValue;
	private String expiryDays;
	private String brandImgUrl;
	private String brandUrl;
	private Date  startDate;
	private Date  endDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPromoOfrId() {
		return promoOfrId;
	}
	public void setPromoOfrId(String promoOfrId) {
		this.promoOfrId = promoOfrId;
	}
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public Double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpValue() {
		return expValue;
	}
	public void setExpValue(String expValue) {
		this.expValue = expValue;
	}
	public String getExpiryDays() {
		return expiryDays;
	}
	public void setExpiryDays(String expiryDays) {
		this.expiryDays = expiryDays;
	}
	public String getBrandImgUrl() {
		return brandImgUrl;
	}
	public void setBrandImgUrl(String brandImgUrl) {
		this.brandImgUrl = brandImgUrl;
	}
	public String getBrandUrl() {
		return brandUrl;
	}
	public void setBrandUrl(String brandUrl) {
		this.brandUrl = brandUrl;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString(){
		return getId()+getTitle();
	}
}

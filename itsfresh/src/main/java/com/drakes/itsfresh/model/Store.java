package com.drakes.itsfresh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="store")
public class Store {
       
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String storeName;
	    private String storeCode;
	    private String address1;
	    private String address2;
	    private String town;
	    private String state;
	    private String postcode;
	    private String fax;
	    private String mobile;
	    private String contact; 
	    private Double discount;
	    private Boolean warnPage;
	    private String ABN;
	    private Boolean active;
	   // private int BusinessId;
	    private Integer groupId;
	    private String email;
	    private String externalRef;
	    //private String salesRepId;
	    private Integer zoneId;
	    private String M3Code;
		public Store() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Store(Integer id, String storeName, String storeCode, String address1, String address2, String town,
				String state, String postcode, String fax, String mobile, String contact, Double discount,
				Boolean warnPage, String ABN, Boolean active, int groupId, String email, String externalRef,
				Integer zoneId, String M3Code) {
			super();
			this.id = id;
			this.storeName = storeName;
			this.storeCode = storeCode;
			this.address1 = address1;
			this.address2 = address2;
			this.town = town;
			this.state = state;
			this.postcode = postcode;
			this.fax = fax;
			this.mobile = mobile;
			this.contact = contact;
			this.discount = discount;
			this.warnPage = warnPage;
			this.ABN = ABN;
			this.active = active;
			this.groupId = groupId;
			this.email = email;
			this.externalRef = externalRef;
			this.zoneId = zoneId;
			this.M3Code = M3Code;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		public String getStoreCode() {
			return storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public String getAddress1() {
			return address1;
		}
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		public String getAddress2() {
			return address2;
		}
		public void setAddress2(String address2) {
			this.address2 = address2;
		}
		public String getTown() {
			return town;
		}
		public void setTown(String town) {
			this.town = town;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPostcode() {
			return postcode;
		}
		public void setPostcode(String postcode) {
			this.postcode = postcode;
		}
		public String getFax() {
			return fax;
		}
		public void setFax(String fax) {
			this.fax = fax;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public Double getDiscount() {
			return discount;
		}
		public void setDiscount(Double discount) {
			this.discount = discount;
		}
		public Boolean getWarnPage() {
			return warnPage;
		}
		public void setWarnPage(Boolean warnPage) {
			this.warnPage = warnPage;
		}
		public String getABN() {
			return ABN;
		}
		public void setABN(String aBN) {
			ABN = aBN;
		}
		public Boolean getActive() {
			return active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		public int getGroupId() {
			return groupId;
		}
		public void setGroupId(int groupId) {
			this.groupId = groupId;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getExternalRef() {
			return externalRef;
		}
		public void setExternalRef(String externalRef) {
			this.externalRef = externalRef;
		}
		public Integer getZoneId() {
			return zoneId;
		}
		public void setZoneId(Integer zoneId) {
			this.zoneId = zoneId;
		}
		public String getM3Code() {
			return M3Code;
		}
		public void setM3Code(String m3Code) {
			this.M3Code = m3Code;
		}
		@Override
		public String toString() {
			return "Store [id=" + id + ", storeName=" + storeName + ", storeCode=" + storeCode + ", address1="
					+ address1 + ", address2=" + address2 + ", town=" + town + ", state=" + state + ", postcode="
					+ postcode + ", Fax=" + fax + ", mobile=" + mobile + ", contact=" + contact + ", discount="
					+ discount + ", warnPage=" + warnPage + ", ABN=" + ABN + ", active=" + active + ", groupId="
					+ groupId + ", email=" + email + ", externalRef=" + externalRef + ", zoneId=" + zoneId + ", M3Code="
					+ M3Code + "]";
		}
	    
}

package com.ajacs.cloudproj.CloudVendor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Component
//@ConfigurationProperties(prefix="vendor")
@Data
@Entity(name = "CloudVendor")
@Table(name = "could_vedor")
@AllArgsConstructor
@NoArgsConstructor
public class CloudVendor {
	
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private long VendorPhoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "did")
	@JsonIgnore
	private Data1 data1;
	
	
	

}

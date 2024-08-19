package com.ajacs.cloudproj.CloudVendor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@Entity(name = "data")
@Table(name = "data")
@AllArgsConstructor
@NoArgsConstructor
public class Data1 {
	
	
	@Id
	private int did;
	private String name;
	
	@OneToOne(mappedBy = "data1")
	private CloudVendor cloudVendor;

}

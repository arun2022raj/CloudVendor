package com.ajacs.cloudproj.CloudVendor.servie.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajacs.cloudproj.CloudVendor.exceptions.CloudVendorNotFoundException;
import com.ajacs.cloudproj.CloudVendor.model.CloudVendor;
import com.ajacs.cloudproj.CloudVendor.repository.CloudVendorRepository;
import com.ajacs.cloudproj.CloudVendor.servie.CloudVendorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CloudVendorServiceimpl implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository ;
	
	

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		//more business logic
		cloudVendorRepository.save(cloudVendor);
		return "data is saved";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		//more business logic
		cloudVendorRepository.save(cloudVendor);
		return "data Updated";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		//more business logic
		cloudVendorRepository.deleteById(cloudVendorId);
		return "cloud vendor deleted";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		//more business logic
		return cloudVendorRepository.findById(cloudVendorId)
				.orElseThrow(()->new CloudVendorNotFoundException("Element not found in database"));
//		return cloudVendor;
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		//more business logic
		return cloudVendorRepository.findAll();
	}

	@Override
	public String patchCloudVendor(String vendorId, CloudVendor cloudVendor) {
		CloudVendor existingcloudVendor = cloudVendorRepository.findById(vendorId)
				.orElseThrow(()->new RuntimeException());
		
		if (cloudVendor.getVendorName()!=null) {
			existingcloudVendor.setVendorName(cloudVendor.getVendorName());
		}
		if (cloudVendor.getVendorAddress()!=null) {
			existingcloudVendor.setVendorAddress(cloudVendor.getVendorAddress());
		}
		if (cloudVendor.getVendorPhoneNumber()>0) {
			existingcloudVendor.setVendorPhoneNumber(cloudVendor.getVendorPhoneNumber());
		}
		cloudVendorRepository.save(existingcloudVendor);
		return "DATA patched sucessufully";
	}

}

package com.ajacs.cloudproj.CloudVendor.servie;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajacs.cloudproj.CloudVendor.model.CloudVendor;

@Service
public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendor();
	public String patchCloudVendor(String vendorId, CloudVendor cloudVendor);

}

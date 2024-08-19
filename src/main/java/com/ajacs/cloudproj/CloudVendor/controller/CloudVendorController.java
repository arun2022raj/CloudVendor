package com.ajacs.cloudproj.CloudVendor.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajacs.cloudproj.CloudVendor.model.CloudVendor;
import com.ajacs.cloudproj.CloudVendor.servie.CloudVendorService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/cloudvendor")
@AllArgsConstructor
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		CloudVendor cloudVendor=cloudVendorService.getCloudVendor(vendorId);
		return cloudVendor;
	}
	
	@GetMapping("/All")
	public List<CloudVendor> getAllCloudVendorDetails( ) {
		List<CloudVendor> cloudVendor=cloudVendorService.getAllCloudVendor();
		return cloudVendor;
	}
	
	@PostMapping("/data")
	public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
		String msg = cloudVendorService.createCloudVendor(cloudVendor);
		return msg;
	}
	
	@PutMapping("/put")
	public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
		String msg = cloudVendorService.updateCloudVendor(cloudVendor);
		return msg;
		
	}
	@DeleteMapping("/delete/{vendorId}")
	public String deleteCloudVendor(@PathVariable("vendorId") String vendorId) {
		String msg = cloudVendorService.deleteCloudVendor(vendorId); 
		return msg;
		
	}
	
	@PatchMapping("/patch/{vendorId}")
	public String patchCloudVendor(@PathVariable("vendorId") String vendorId,@RequestBody CloudVendor cloudVendor) {
		String msg = cloudVendorService.patchCloudVendor(vendorId,cloudVendor); 
		return msg;
		
	}

}

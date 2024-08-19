package com.ajacs.cloudproj.CloudVendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajacs.cloudproj.CloudVendor.model.CloudVendor;


@Repository
public interface CloudVendorRepository  extends JpaRepository<CloudVendor, String>{

}

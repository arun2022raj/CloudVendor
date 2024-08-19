package com.ajacs.cloudproj.CloudVendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajacs.cloudproj.CloudVendor.model.Data1;

@Repository
public interface Data1Repository extends JpaRepository<Data1, Integer> {
}

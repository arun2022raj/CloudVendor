package com.ajacs.cloudproj.CloudVendor.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Data
public class CloudVendorException {
	
	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpStatus;

}

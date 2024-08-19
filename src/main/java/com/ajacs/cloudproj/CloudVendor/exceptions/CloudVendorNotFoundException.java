package com.ajacs.cloudproj.CloudVendor.exceptions;

public class CloudVendorNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CloudVendorNotFoundException(String message) {
		super(message);
	}

	public CloudVendorNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

}

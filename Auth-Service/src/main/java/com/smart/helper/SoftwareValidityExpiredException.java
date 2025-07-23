package com.smart.helper;

import org.springframework.security.core.AuthenticationException;

public class SoftwareValidityExpiredException extends AuthenticationException {
	private static final long serialVersionUID = 1L;

	public SoftwareValidityExpiredException(String message) {
		super(message);
	    }
}

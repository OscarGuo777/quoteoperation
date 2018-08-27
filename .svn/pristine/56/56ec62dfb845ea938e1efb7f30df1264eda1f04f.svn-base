package com.jz.quoteoperation.common.exception;

import org.springframework.core.NestedRuntimeException;

public class ApplicationException extends NestedRuntimeException {

	public static String EXCEPTION_CODE_AUTHORITY = "exceptionCodeAuthority";
	
	private String exceptionCode;

	public ApplicationException(String msg) {
		this(null, msg);
	}
	
	public ApplicationException(String exceptionCode, String msg) {
		this(exceptionCode, msg, null);
	}
	
	public ApplicationException(String exceptionCode, String msg, Throwable throwable) {
		this(msg, throwable);
		this.exceptionCode = exceptionCode;
	} 

	public ApplicationException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}

}

package com.assimilate.matrimony.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends Exception {
	
	String message="Not Found";
	
	 private static final long serialVersionUID = 1L;
     
	    public RecordNotFoundException(String message) {
	        super(message);
	    }
	     
	    public RecordNotFoundException(String message, Throwable t) {
	        super(message, t);
	    }
	

}

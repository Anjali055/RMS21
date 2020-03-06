package com.assimilate.matrimony.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

<<<<<<< HEAD
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;

			public RecordNotFoundException(String message)
		{
		super(message);
		}
	

	public RecordNotFoundException(String message,Throwable t) 
	{
		super(message,t);
	}

		}

=======
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends Exception {
	
	
	 private static final long serialVersionUID = 1L;
     
	    public RecordNotFoundException(String message) {
	        super(message);
	    }
	     
	    public RecordNotFoundException(String message, Throwable t) {
	        super(message, t);
	    }
	

}
>>>>>>> f981900817d7a49a6148140e8821500d94310551

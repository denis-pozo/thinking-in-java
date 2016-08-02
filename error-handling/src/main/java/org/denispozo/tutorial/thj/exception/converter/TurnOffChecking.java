package org.denispozo.tutorial.thj.exception.converter;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Converting checked to unchecked exceptions
 * Example
 */

public class TurnOffChecking {
	
	public static void main(String[] args) throws Exception {
		WrapCheckedException wce = new WrapCheckedException();
		// You can call throwRuntimeException() without a try
		// block and let RE leave the method: 
		wce.throwRuntimeException(3);
		// Or you can choose to catch exceptions:
		for(int i = 0 ; i < 4 ; i++){
			try {
				if(i < 3){
					wce.throwRuntimeException(i);
				} else {
					throw new SomeOtherExecption();
				}
			} catch(SomeOtherExecption soe) {
				print("SomeOtherException: " + soe);
			} catch(RuntimeException re) {
				try {
					throw re.getCause();
				} catch(FileNotFoundException fnf) {
					print("FileNotFoundException: " + fnf);
				} catch(IOException ioe) {
					print("InputOutputException: " + ioe);
				} catch (Throwable e) { 
					print("Throwable: " + e);
				}
			}
		}
	}
}


class WrapCheckedException {
	void throwRuntimeException(int type) {
		try{
			switch(type) {
				case 0: throw new FileNotFoundException();
				case 1: throw new IOException();
				case 2: throw new RuntimeException("Where am I?");
				default: return;
			}
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class SomeOtherExecption extends Exception {
	private static final long serialVersionUID = 1L;
}

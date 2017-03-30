package org.denispozo.tutorial.thj.exception.converter;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Converting checked to unchecked exceptions
 * Exercise 30
 */

public class HumanEx30 {
	
	public static void main(String[] args) {
		WrapCheckedExceptionEx30 wce = new WrapCheckedExceptionEx30();
		
		//You can call throwRuntimeException() without a try
		//block and let RE leave the method: 
		wce.throwRuntimeException(3);
		//Or you can choose to catch exceptions:
		for(int i = 0 ; i < 4 ; i++){
			try {
				if(i < 3){
					wce.throwRuntimeException(i);
				} else {
					throw new RuntimeException();
				}
			} catch(RuntimeException re) {
				try {
					throw re.getCause();
				} catch(Annoyance a) {
					print("Annoyance: " + a);
				} catch(Sneeze s) {
					print("InputOutputException: " + s);
				} catch (Throwable e) { 
					print("Throwable: " + e);
				}
			}
		}
	}
}

class WrapCheckedExceptionEx30 {
	void throwRuntimeException(int type) {
		try {
			switch (type) {
			case 0:
				throw new Annoyance();
			case 1:
				throw new Sneeze();
			case 2:
				throw new RuntimeException("Where am I?");
			default:
				return;
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Annoyance extends RuntimeException {
	private static final long serialVersionUID = 1L;
}

class Sneeze extends RuntimeException {
	private static final long serialVersionUID = 1L;
}

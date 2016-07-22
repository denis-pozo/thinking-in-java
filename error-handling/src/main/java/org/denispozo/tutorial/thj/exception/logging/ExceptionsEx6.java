package org.denispozo.tutorial.thj.exception.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/*
 * Chapter - Error Handling with Exceptions
 * Section - Creating your Own Exceptions
 * Exercise 6
 */

public class ExceptionsEx6 {
	
	static void f() throws Shiit {
		throw new Shiit();
	}
	
	static void g() throws HolyShiit {
		throw new HolyShiit();
	}
		
	public static void main(String[] args) {

		try{
			f();
		}catch(Shiit shiit){ }
		
		try{
			g();
		}catch(HolyShiit shiit){ }
		
	}
}

class Shiit extends Exception {
	
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger("Shiit");
	
	public Shiit() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		log.severe(trace.toString());
	}
	
}

class HolyShiit extends Exception {
	
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger("HolyShiit");

	public HolyShiit() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		log.severe(trace.toString());
	}
}
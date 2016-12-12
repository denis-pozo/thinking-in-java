package org.denispozo.tutorial.thj.type.information.ifaces.client;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.reflect.Method;

import org.denispozo.tutorial.thj.type.information.ifaces.A;
import org.denispozo.tutorial.thj.type.information.ifaces.HiddenC;

/*
 * Chapter - Type Information
 * Section - Interfaces and type information
 * Example
 */

public class HiddenImplementation {

	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		print(a.getClass().getName());

//		Compile error: cannot find C
//		if(a instanceof C) {
//			C c = (C) a;
//			c.g();			
//		}
		
		// Oops! Reflection still allows us to call g():
		callHiddenMethod(a,"g");
		// And even methods that are less accessible
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
		
	}
	
	private static void callHiddenMethod(Object a, String methodName) throws Exception{
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);		
	}
}

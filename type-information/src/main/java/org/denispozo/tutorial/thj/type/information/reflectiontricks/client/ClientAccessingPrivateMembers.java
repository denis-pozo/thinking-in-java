package org.denispozo.tutorial.thj.type.information.reflectiontricks.client;

import java.lang.reflect.Method;

import org.denispozo.tutorial.thj.type.information.reflectiontricks.TestClass;

/*
 * Chapter - Type Information
 * Section - Interfaces and type information
 * Exercise 25
 */

public class ClientAccessingPrivateMembers {

	public static void main(String[] args) throws Exception {
		TestClass c = new TestClass();

		
		// Oops! Reflection still allows us to call g():
		callHiddenMethod(c,"f");
		// And even methods that are less accessible
		callHiddenMethod(c, "u");
		callHiddenMethod(c, "v");
		callHiddenMethod(c, "w");
		
	}
	
	static void callHiddenMethod(Object a, String methodName) throws Exception{
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);		
	}
}

package org.denispozo.tutorial.thj.type.information.proxy.exercise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/*
 * Chapter - Type Information
 * Section - Dynamic Proxies
 * Exercise 22
 */

public class SimpleDynamicProxyEx22 {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.doSomethingElse("bonobo");
	}
	
	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		
		// Insert a proxy call again:
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class [] {Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}

class DynamicProxyHandler implements InvocationHandler {
	
	private Object proxied;
	
	public DynamicProxyHandler(Object proxied){
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long timeIn = new Date().getTime();
		System.out.println("**** proxy: " + proxy.getClass() + ", method: " +
							method + ", args: " + args
							+ " invoked at " + timeIn + " on " + (new Date()));
		
		if(args != null) { 
			for(Object arg : args){ 
				System.out.println(" " + arg);
			}
		}
		
		long timeOut = new Date().getTime();
		System.out.println("Method call-return time: " + (timeOut-timeIn) + " msecs");
		return method.invoke(proxied, args);
	}
}


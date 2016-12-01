package org.denispozo.tutorial.thj.type.information.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * Chapter - Type Information
 * Section - Dynamic Proxies
 * Example
 */

public class SimpleDynamicProxy {

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
		System.out.println("**** proxy: " + proxy.getClass() + ", method: " +
							method + ", args: " + args);
		if(args != null) {
			for(Object arg : args){ 
				System.out.println(" " + arg);
			}
		}
		
		return method.invoke(proxied, args);
	}
	
}


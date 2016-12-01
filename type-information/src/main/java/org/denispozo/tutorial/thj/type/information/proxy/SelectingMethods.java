package org.denispozo.tutorial.thj.type.information.proxy;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * Chapter - Type Information
 * Section - Dynamic Proxies
 * Example
 */

public class SelectingMethods {

	public static void main(String[] args) {
		SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(
								SomeMethods.class.getClassLoader(),
								new Class [] { SomeMethods.class },
								new MethodSelector(new Implementation()));
		proxy.boring1();
		proxy.boring2();
		proxy.interesting("bonobo");
		proxy.boring3();
	}
}

class MethodSelector implements InvocationHandler {
	
	private Object proxied;
	
	public MethodSelector(Object proxied){
		this.proxied = proxied;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("interesting")){
			print("Proxy detected the interesting method");
		}
		return method.invoke(proxied, args);
	}
}

interface SomeMethods {
	void boring1();
	void boring2();
	void interesting(String arg);
	void boring3();
}

class Implementation implements SomeMethods {

	@Override
	public void boring1() {
		print("boring1()");
	}

	@Override
	public void boring2() {
		print("boring2()");
	}

	@Override
	public void interesting(String arg) {
		print("interesting " + arg);
	}

	@Override
	public void boring3() {
		print("boring3()");
	}
	
}
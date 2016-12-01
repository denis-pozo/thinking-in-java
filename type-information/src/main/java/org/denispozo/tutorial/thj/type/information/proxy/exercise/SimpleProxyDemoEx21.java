package org.denispozo.tutorial.thj.type.information.proxy.exercise;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Date;

/*
 * Chapter - Type Information
 * Section - Dynamic Proxies
 * Exercise 21
 */

public class SimpleProxyDemoEx21 {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.doSomethingElse("bonobo");
	}
	
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
		print();
		consumer(new SimpleProxy(new RealObject()));
		print();
		consumer(new SimpleProxy(new RealObject()));
	}
}


interface Interface {
	void doSomething();
	void doSomethingElse(String arg);
}

class RealObject implements Interface {

	@Override
	public void doSomething() {
		print("doSomething()");
	}

	@Override
	public void doSomethingElse(String arg) {
		print("doSomethingElse(" + arg + ")");
	}
}

class SimpleProxy implements Interface {
	
	private Interface proxied;
	private static int doSomethingCounter = 0;
	private static int doSomethingElseCounter = 0;
	
	public SimpleProxy(Interface proxied){
		this.proxied = proxied;
	}
	
	@Override
	public void doSomething() {
		long timeIn = new Date().getTime();
		print("Time called doSomething() " + ++doSomethingCounter + 
				": " + timeIn + " msecs" );
		proxied.doSomething();
		print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs" );
	}
	
	@Override
	public void doSomethingElse(String arg) {
		long timeIn = new Date().getTime();
		print("Time called doSomethingElse() " + ++doSomethingElseCounter + 
				": " + timeIn + " msecs" );
		proxied.doSomethingElse(arg);
		print("Call-return time = " + ((new Date().getTime()) - timeIn) + " msecs" );
	}
	
}
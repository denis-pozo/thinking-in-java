package org.denispozo.tutorial.thj.type.information.proxy;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - Dynamic Proxies
 * Example
 */

public class SimpleProxyDemo {

	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.doSomethingElse("bonobo");
	}
	
	public static void main(String[] args) {
		consumer(new RealObject());
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
	
	public SimpleProxy(Interface proxied){
		this.proxied = proxied;
	}
	
	@Override
	public void doSomething() {
		print("SimpleProxy doSomething()");
		proxied.doSomething();
	}
	
	@Override
	public void doSomethingElse(String arg) {
		print("SimpleProxy doSomethingElse(" + arg + ")");
		proxied.doSomethingElse(arg);
	}
	
}
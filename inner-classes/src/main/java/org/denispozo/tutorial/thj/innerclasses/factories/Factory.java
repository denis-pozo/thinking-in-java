package org.denispozo.tutorial.thj.innerclasses.factories;

import static org.denispozo.tutorial.thj.util.Print.*;

/*
 * Chapter - Inner Classes
 * Section - Factory Method Revisited
 * No Exercise
 */

public class Factory {
	
	public static void serviceCustomer(ServiceFactory fact){
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String [] args){
		serviceCustomer(Implementation1.factory);
		// Implementations are completely interchangeable
		serviceCustomer(Implementation2.factory);
	}
}

interface Service {
	void method1();
	void method2();		
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	
	private Implementation1() {	}
		
	public void method1() { print("Implementation1.method1()"); }
	public void method2() { print("Implementation1.method2()"); }
	
	public static ServiceFactory factory = new ServiceFactory(){
		public Service getService() {
			return new Implementation1();
		}
	};
}

class Implementation2 implements Service {
	
	private Implementation2() {	}
		
	public void method1() { print("Implementation2.method1()"); }
	public void method2() { print("Implementation2.method2()"); }
	
	public static ServiceFactory factory = new ServiceFactory(){
		public Service getService() {
			return new Implementation2();
		}
	};
}
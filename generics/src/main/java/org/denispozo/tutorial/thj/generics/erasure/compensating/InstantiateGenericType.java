package org.denispozo.tutorial.thj.generics.erasure.compensating;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Generics
 * Section - Creating Instances of Types
 * Example
 */

public class InstantiateGenericType {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		print("ClassAsFactory<Employee> succeeded");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {
			print("ClassAsFactory<Integer> failed");
		}
	}
}

class ClassAsFactory<T> {
	T x;
	
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Employee {}
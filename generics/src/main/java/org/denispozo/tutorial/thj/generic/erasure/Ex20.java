package org.denispozo.tutorial.thj.generic.erasure;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Generics
 * Section - The C++ Approach
 * Exercise 20
 */

public class Ex20 {
		
	public <T extends Interface1> void genericMethod(T arg){
		arg.f();
		arg.g();
	}

	public static void main(String[] args) {
		Ex20 test = new Ex20();
		test.genericMethod(new A());
	}
}

interface Interface1 {
	public void f();
	public void g();
}

class A implements Interface1 {

	@Override
	public void f() {
		print("A.f()");
		
	}

	@Override
	public void g() {
		print("A.g()");
		
	}
	
	public void h() {
		print("A.h()");
	}
	
}

package org.denispozo.tutorial.thj.innerclasses.mesh;

public class Main {
	
	public static void main(String [] args){
		B b = new B();
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		A a5 = new A();
		A a6 = new A();
		
		b.addU(a1.makeU());
		b.addU(a2.makeU());
		b.addU(a3.makeU());
		b.addU(a4.makeU());
		b.addU(a5.makeU());
		b.addU(a6.makeU());
		
		b.execute();
		
		b.setNull(2);
		b.setNull(8);
		b.setNull(10);
		
		b.execute();
		
	}

}

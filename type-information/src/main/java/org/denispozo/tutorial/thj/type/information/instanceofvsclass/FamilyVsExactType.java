package org.denispozo.tutorial.thj.type.information.instanceofvsclass;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

/*
 * Chapter - Type Information
 * Section - instanceof vs. Class equivalence
 * Example
 */

public class FamilyVsExactType {
	
	static void test(Object obj) {
		print("Testing obj of type " + obj.getClass().getSimpleName());
		print("obj instanceof Base " + (obj instanceof Base));
		print("obj instanceof Derived " + (obj instanceof Derived));
		print("Base.isInstance(obj) " + Base.class.isInstance(obj));
		print("Derived.isInstance(obj) " + Derived.class.isInstance(obj));
		print("obj.getClass() == Base.class " + (obj.getClass() == Base.class));
		print("obj.getClass() == Derived.class " + (obj.getClass() == Derived.class));
		print("obj.getClass().equals(Base.class) " + (obj.getClass().equals(Base.class)));
		print("obj.getClass().equals(Derived.class) " + (obj.getClass().equals(Derived.class)));
	}
	
	public static void main(String[] args) {
		test(new Base());
		test(new Derived());
	}
}

class Base {}
class Derived extends Base {}
package org.denispozo.tutorial.thj.innerclasses.nested;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Nested Classes
 * Exercise 19
 */
public class OuterClass {
	
	OuterClass() { System.out.println("OuterClass()"); }
	
	private class InnerClass {
		InnerClass() { System.out.println("InnerClass()"); } 
		private class InnerInnerClass {
			InnerInnerClass() {
				System.out.println("InnerInnerClass()");
			}
		}
	}
	
	private static class NestedClass {
		NestedClass() { System.out.println("NestedClass()"); }
		private static class NestedNestedClass {
			NestedNestedClass() { 
				System.out.println("NestedNestedClass()"); 
			}
		}
	}	
	public static void main(String[] args) {
		NestedClass nested = new NestedClass();
		print(nested.getClass());
		NestedClass.NestedNestedClass nestedNested = new NestedClass.NestedNestedClass();
		print(nestedNested.getClass());
		OuterClass outer = new OuterClass();
		print(outer.getClass());
		OuterClass.InnerClass inner = outer.new InnerClass();
		print(inner.getClass());
		OuterClass.InnerClass.InnerInnerClass innerInnerClass = inner.new InnerInnerClass();
		print(innerInnerClass.getClass());
	}
}

/* compiler produces:
* Ex19$Ex19Inner$Ex19InnerInner.class
* Ex19$Ex19Inner.class
* Ex19$Ex19Nested$Ex19NestedNested.class
* Ex19$Ex19Nested.class
* Ex19.class
*/
package org.denispozo.tutorial.thj.type.information;

/*
 * Chapter - Type Information
 * Section - The Class Object
 * Exercise 9
 */

public class Exercise9 {
	public static void hierarchy(Object o) {
		Object[] fields = o.getClass().getDeclaredFields();
		if(fields.length == 0)
			System.out.println(o.getClass() + " has no fields");
		if(fields.length > 0) {
			System.out.println("Field(s) of " + o.getClass() + ":");
			for(Object obj : fields) 
				System.out.println(" " + obj);
		}
		if(o.getClass().getSuperclass() != null) {			
			System.out.println(o.getClass() + " is a subclass of " + 
				o.getClass().getSuperclass()); 
			try {
				hierarchy(o.getClass().getSuperclass().newInstance());
			} catch(InstantiationException e) {
				System.out.println("Unable to instantiate obj");
			} catch(IllegalAccessException e) {
				System.out.println("Unable to access");
			}
		} 
	}
	public static void main(String[] args) {
		hierarchy(new C());
	}
}

class X {}

class Y extends X {}

class Z extends Y {}
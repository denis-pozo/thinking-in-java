package org.denispozo.tutorial.thj.type.information.toys;

/*
 * Chapter - Type Information
 * Section - Generic Class References
 * Example
 */

public class GenericToyTest {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Class<FancyToy> ftClass = FancyToy.class;
		// Produces exact Type:
		FancyToy fancyToy = ftClass.newInstance();
		Class<? super FancyToy> up = ftClass.getSuperclass();
		System.out.println(up);
		// This wont compile
		// Class<Toy> up2 = ftClass.getSuperClass();
		// Only produces Object:
		Object obj = up.newInstance();
	}
}
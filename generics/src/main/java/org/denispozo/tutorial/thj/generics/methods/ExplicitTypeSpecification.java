package org.denispozo.tutorial.thj.generics.methods;

import java.util.List;
import java.util.Map;

import org.denispozo.tutorial.thj.type.information.shop.pet.Person;
import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;

/*
 * Chapter - Generics
 * Section - Explicit type specification
 * Example
 */

public class ExplicitTypeSpecification {
	
	static void f(Map<Person, List<Pet>> petPeople) {	}
		
	public static void main(String[] args) {
		f(New.<Person, List<Pet>>map());
		
	}
}

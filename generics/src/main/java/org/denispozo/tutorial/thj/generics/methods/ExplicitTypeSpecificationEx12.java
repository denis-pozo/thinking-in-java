package org.denispozo.tutorial.thj.generics.methods;

import java.util.List;
import java.util.Map;

import org.denispozo.tutorial.thj.type.information.shop.pet.Person;
import org.denispozo.tutorial.thj.type.information.shop.pet.Pet;

/*
 * Chapter - Generics
 * Section - Explicit type specification
 * Exercise 12
 */

public class ExplicitTypeSpecificationEx12 {
	
	static void f(Map<Person, List<? extends Pet>> petPeople) {	}
		
	public static void main(String[] args) {
		f(New.<Person, List<? extends Pet>>map());
		
	}
}

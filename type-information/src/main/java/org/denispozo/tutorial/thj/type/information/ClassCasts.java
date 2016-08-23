package org.denispozo.tutorial.thj.type.information;

/*
 * Chapter - Type Information
 * Section - New cast syntax
 * Example
 */

class Building {}
class House extends Building {}

public class ClassCasts {
	@SuppressWarnings("unused")
	public static void main(String [] args){
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House) b;
	}
}
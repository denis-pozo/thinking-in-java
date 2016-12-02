package org.denispozo.tutorial.thj.type.information.startup;

import org.denispozo.tutorial.thj.util.Null;

class Person {

	public static final Person NULL = new NullPerson();
	
	public final String first;
	public final String last;
	public final String address;
	
	public Person(String first, String last, String address) {
		this.first = first;
		this.last = last;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person: " + first + " " + last + " " + address;
	}
	
	public static class NullPerson extends Person
	   implements Null {

		private NullPerson() { 
			super("None", "None", "None"); 
		}

		@Override
		public String toString() {
			return "NullPerson";
		}
	}
}

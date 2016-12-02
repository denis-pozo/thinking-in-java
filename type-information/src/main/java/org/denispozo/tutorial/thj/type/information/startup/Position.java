package org.denispozo.tutorial.thj.type.information.startup;

/*
 * Chapter - Type Information
 * Section - Null Objects
 * Example
 */

public class Position {
	
	private String title;
	private Person person;
	
	public Position(String jobTitle, Person employee) {
		title = jobTitle;
		person = employee;
		if(person == null) {
			person = Person.NULL;
		}
	}
	
	public Position(String jobTitle) {
		title = jobTitle;
		person = Person.NULL;
	}
	
	public Person getPerson() { 
		return person; 
	}
	
	public void setPerson(Person newPerson) {
		 person = newPerson;
		 if(person == null) {
			 person = Person.NULL;
		 }
	}

	@Override
	public String toString() {
		return "Position: " + title + " " + person;
	}

	public String getTitle() {
		return title;
	}
}


package org.denispozo.tutorial.thj.type.information.pets;

public class Individual {
	private static long COUNTER;
	private final long id = COUNTER++;
	private final String name;
	
	public Individual(){
		name = "";
	}
	
	public Individual(String name){
		this.name = name;
	}
	
	public String toString() {
		return id + (name == null ? "" : ": " + name); 
	}
	
}

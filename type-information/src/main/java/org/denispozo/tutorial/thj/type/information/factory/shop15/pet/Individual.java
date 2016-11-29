package org.denispozo.tutorial.thj.type.information.factory.shop15.pet;

import org.denispozo.tutorial.thj.type.information.factory.shop15.PetFactory;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Exercise 15
 */

public class Individual extends PetFactory implements Comparable<Individual>{
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
	
	public long id() {
		return id;
	}
	
	public boolean equals(Object o) {
		return o instanceof Individual && 
				id == ((Individual)o).id;
	}
	
	public int hasCode() {
		int result = 17;
		
		if(name != null){
				result = 37 * result + name.hashCode();
		} else {
			result = 37 * result + (int) id;
		}
		
		return result;
	}

	@Override
	public int compareTo(Individual arg) {
		// Compare by class name first:
		String first = getClass().getSimpleName();
		String argFirst = arg.getClass().getSimpleName();
		int firstCompare = first.compareTo(argFirst);
		
		if(firstCompare != 0){
			return firstCompare;
		}
		
		// Then compare by name:
		if(name != null && arg.name != null) {
			int secondCompare = name.compareTo(arg.name);
			if(secondCompare != 0) {
				return secondCompare;
			}
		}
		return (arg.id < id ? -1 : (arg.id == id ? 0 : 1));
	}
	
}

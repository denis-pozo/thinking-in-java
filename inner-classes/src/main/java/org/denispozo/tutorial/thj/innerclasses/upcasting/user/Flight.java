package org.denispozo.tutorial.thj.innerclasses.upcasting.user;

import static org.denispozo.tutorial.thj.util.Print.*;

import org.denispozo.tutorial.thj.innerclasses.upcasting.Trip;
import org.denispozo.tutorial.thj.innerclasses.upcasting.api.Destination;

/*
 * Chapter - Inner Classes
 * Section - Inner classes and Upcasting
 * Exercise 6
 */

public class Flight extends Trip{
	
	Destination getDestination(){
		return this.new TripDestination("Bahamas");
	}
	
	public static void main(String [] args) {
		Flight flight = new Flight();
		print(flight.getDestination().getName());
	}
	
	

}

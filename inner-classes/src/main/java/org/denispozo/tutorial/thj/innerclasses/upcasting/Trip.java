package org.denispozo.tutorial.thj.innerclasses.upcasting;

import org.denispozo.tutorial.thj.innerclasses.upcasting.api.Destination;



/*
* Chapter - Inner Classes
* Section - Inner classes and Upcasting
* Exercise 6
*/

public class Trip {

	protected class TripDestination implements Destination {
		
		private String destination;
		
		public TripDestination(String destination) {
			this.destination = destination;
		}
		
		@Override
		public String getName() {
			return destination;
		}
		
	}
}

package org.denispozo.tutorial.thj.type.information.factory.depo;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class CabinAirFilter extends Filter {
	public static class Factory implements 
		org.denispozo.tutorial.thj.type.information.factory.Factory<CabinAirFilter> {

		@Override
		public CabinAirFilter create() {
		return new CabinAirFilter();
		}
		
	}

}

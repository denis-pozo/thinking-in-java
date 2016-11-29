package org.denispozo.tutorial.thj.type.information.factory.depo;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class AirFilter extends Filter {
	
	public static class Factory implements org.denispozo.tutorial.thj.type.information.factory.Factory<AirFilter> {
		@Override
		public AirFilter create() {
			return new AirFilter();
		}
	}
}

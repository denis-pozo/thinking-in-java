package org.denispozo.tutorial.thj.type.information.factory.depo;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class FuelFilter extends Filter {
	public static class Factory implements org.denispozo.tutorial.thj.type.information.factory.Factory<FuelFilter> {
		@Override
		public FuelFilter create() {
			return new FuelFilter();
		}
	}
}

package org.denispozo.tutorial.thj.type.information.factory.depo;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class OilFilter extends Filter {
	public static class Factory implements org.denispozo.tutorial.thj.type.information.factory.Factory<OilFilter> {

		@Override
		public OilFilter create() {
			return new OilFilter();
		}
		
	}
}

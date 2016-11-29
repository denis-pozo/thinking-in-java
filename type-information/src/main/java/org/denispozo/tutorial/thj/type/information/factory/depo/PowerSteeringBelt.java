package org.denispozo.tutorial.thj.type.information.factory.depo;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class PowerSteeringBelt extends Belt {
	public static class Factory implements org.denispozo.tutorial.thj.type.information.factory.Factory<PowerSteeringBelt>{

		@Override
		public PowerSteeringBelt create() {
			return new PowerSteeringBelt();
		}
		
	}
}

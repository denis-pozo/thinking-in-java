package org.denispozo.tutorial.thj.type.information.factory.depo;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class FanBelt extends Belt {
	public static class Factory implements org.denispozo.tutorial.thj.type.information.factory.Factory<FanBelt> {
		@Override
		public FanBelt create() {
			return new FanBelt();
		}
	}
}

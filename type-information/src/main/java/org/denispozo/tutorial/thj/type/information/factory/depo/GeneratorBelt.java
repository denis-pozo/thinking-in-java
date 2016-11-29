package org.denispozo.tutorial.thj.type.information.factory.depo;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class GeneratorBelt extends Belt {
	public static class Factory implements org.denispozo.tutorial.thj.type.information.factory.Factory<GeneratorBelt> {

		@Override
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}

	}
}

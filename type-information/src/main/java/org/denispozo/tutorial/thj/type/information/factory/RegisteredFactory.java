package org.denispozo.tutorial.thj.type.information.factory;

import org.denispozo.tutorial.thj.type.information.factory.depo.Part;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public class RegisteredFactory {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(Part.createRandom());
		}
	}

}


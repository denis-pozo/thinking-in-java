package org.denispozo.tutorial.thj.type.information.factory.shop15;;

/*
 * Chapter - Type Information
 * Section - Registered Factories
 * Example
 */

public interface Factory<T> {
	T create ();
	T create (String name);
}

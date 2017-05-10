package org.denispozo.tutorial.thj.generics.methods;

import org.denispozo.tutorial.thj.util.Generator;

/*
 * Chapter - Generics
 * Section - A general-purpose Generator
 * Example
 */

public class BasicGenerator<T> implements Generator<T> {
	
	private Class<T> type;
	
	public BasicGenerator(Class<T> type){
		this.type = type;
	}

	@Override
	public T next() {
		try{
			return type.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
}

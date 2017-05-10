package org.denispozo.tutorial.thj.generics.methods;

import java.util.ArrayList;
import java.util.Collection;

import org.denispozo.tutorial.thj.generics.interfaces.Fibonacci;
import org.denispozo.tutorial.thj.generics.interfaces.coffeeshop.Coffee;
import org.denispozo.tutorial.thj.generics.interfaces.coffeeshop.CoffeeGenerator;
import org.denispozo.tutorial.thj.util.Generator;

/*
 * Chapter - Generics
 * Section - A generic method to use with Generators
 * Example
 */

public class Generators {
	
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
		for(int i = 0 ; i < n ; i++){
			coll.add(gen.next());
		}
		return coll;
	}
		
	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for(Coffee c : coffee){
			System.out.println(c);
		}
		
		Collection<Integer> integers = fill(new ArrayList<Integer>(), new Fibonacci(), 22);
		for(Integer i : integers){
			System.out.print(i + " ");
		}
	}
}

package org.denispozo.tutorial.thj.generics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.denispozo.tutorial.thj.generics.interfaces.Fibonacci;
import org.denispozo.tutorial.thj.generics.interfaces.Generator;
import org.denispozo.tutorial.thj.generics.interfaces.coffeeshop.Coffee;
import org.denispozo.tutorial.thj.generics.interfaces.coffeeshop.CoffeeGenerator;

/*
 * Chapter - Generics
 * Section - A generic methdo to use with Generators
 * Exercise 13
 */

public class GeneratorsEx13 {
	
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
		for(int i = 0 ; i < n ; i++){
			coll.add(gen.next());
		}
		return coll;
	}
	
	public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n) {
		for(int i = 0 ; i < n ; i++){
			coll.add(gen.next());			
		}
		return coll;
	}
	
	public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n) {
		for(int i = 0 ; i < n ; i++){
			coll.add(gen.next());			
		}
		return coll;
	}
	
	public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n) {
		for(int i = 0 ; i < n ; i++){
			coll.add(gen.next());			
		}
		return coll;
	}
	
	public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen, int n) {
		for(int i = 0 ; i < n ; i++){
			coll.add(gen.next());			
		}
		return coll;
	}
		
	public static void main(String[] args) {
		List<Coffee> coffee = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4);
		for(Coffee c : coffee){
			System.out.print(c + " ");
		}
		System.out.println();
		
		Queue<Integer> integers = fill(new ArrayDeque<Integer>(), new Fibonacci(), 22);
		for(Integer i : integers){
			System.out.print(i + " ");
		}
		System.out.println();
		
		Set<Coffee> coffeee = fill(new HashSet<Coffee>(), new CoffeeGenerator(), 4);
		for(Coffee c : coffeee){
			System.out.print(c + " ");
		}
		System.out.println();
	}
}

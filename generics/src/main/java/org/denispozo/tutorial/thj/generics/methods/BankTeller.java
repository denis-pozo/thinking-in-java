package org.denispozo.tutorial.thj.generics.methods;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import org.denispozo.tutorial.thj.util.Generator;

/*
 * Chapter - Generics
 * Section - Anonymous Inner Classes
 * Example
 */

public class BankTeller {
	
	public static void serve (Teller t, Customer c) {
		print(t + " serves " + c);
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator, 4);
		
		for(Customer c : line) {
			serve(tellers.get(rand.nextInt(tellers.size())), c);
		}
	}
}


class Customer {
	private static long counter = 1;
	private final long id = counter++;
	
	private Customer() { }
	
	public String toString() { return "Customer " + id; }
	
	// A method to produce generator objects:
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			public Customer next() {
				return new Customer();
			}
		};
	}	
}

class Teller {
	private static long counter = 1;
	private final long id = counter++;
	
	private Teller() { }
	
	public String toString() { return "Teller " + id; }
	
	// A single Generator object:
	public static Generator<Teller> generator = new Generator<Teller>(){
		public Teller next() {
			return new Teller();
		}
	};
}
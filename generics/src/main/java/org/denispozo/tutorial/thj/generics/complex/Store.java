package org.denispozo.tutorial.thj.generics.complex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.denispozo.tutorial.thj.generics.methods.Generators;
import org.denispozo.tutorial.thj.util.Generator;

/*
 * Chapter - Generics
 * Section - Building Complex Models
 * Example
 */

public class Store extends ArrayList<Aisle> {
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private List<CheckoutStand> checkouts =
			new ArrayList<CheckoutStand>();
	@SuppressWarnings("unused")
	private Office office = new Office();
	
	public Store(int nAisles, int nShelves, int nProducts) {
		
		for(int i = 0 ; i < nAisles ; i++){
			add(new Aisle(nShelves, nProducts));
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(Aisle a : this) {
			for(Shelf s : a) {
				for(Product p : s){
					result.append(p);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}
}

class Product {
	private final int id;
	private String description;
	private double price;
	
	public Product(int IDnumber, String descr, double price) {
		id = IDnumber;
		description = descr;
		this.price = price;
		System.out.println(toString());
	}
	
	public String toString() {
		return id + ": " + description + ", price: $" + price; 
	}
	
	public void priceChange(double change){
		price += change;
	}
	
	public static Generator<Product> generator = new Generator<Product>() {
		private Random rand = new Random(47);
		public Product next() {
			return new Product(rand.nextInt(1000), "Test", 
					Math.round(rand.nextDouble() * 1000.0) + 0.99);
		}
	};
	
}

class Shelf extends ArrayList<Product> {

	private static final long serialVersionUID = 5954870802724663386L;

	public Shelf(int nProducts){
		Generators.fill(this, Product.generator, nProducts);
	}
	

}

class Aisle extends ArrayList<Shelf> {

	private static final long serialVersionUID = 1L;

	public Aisle(int nSelves, int nProducts){
		for(int i = 0 ; i < nSelves ; i++) {
			add(new Shelf(nProducts));
		}
	}
}

class CheckoutStand {}
class Office {}
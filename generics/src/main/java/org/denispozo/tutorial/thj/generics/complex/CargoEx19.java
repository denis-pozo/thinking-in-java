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

public class CargoEx19 extends ArrayList<Row> {
	
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private List<Status> checkouts =
			new ArrayList<Status>();
	@SuppressWarnings("unused")
	private Ship ship = new Ship();
	
	public CargoEx19(int nRows, int nColumns, int nContainers) {
		
		for(int i = 0 ; i < nRows ; i++){
			add(new Row(nColumns, nContainers));
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(Row row : this) {
			for(Column column : row) {
				for(Container container : column){
					result.append(container);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new CargoEx19(14, 5, 10));
	}
}

class Container {
	private final int id;
	private String description;
	private double weight;
	
	public Container(int IDnumber, String descr, double weight) {
		id = IDnumber;
		description = descr;
		this.weight = weight;
		System.out.println(toString());
	}
	
	public String toString() {
		return id + ": " + description + ", weight: " + weight + " Kg"; 
	}
	
	public void weightChange(double change){
		weight += change;
	}
	
	public static Generator<Container> generator = new Generator<Container>() {
		private Random rand = new Random(47);
		public Container next() {
			return new Container(rand.nextInt(1000), "Test", 
					Math.round(rand.nextDouble() * 1000.0));
		}
	};
	
}

class Column extends ArrayList<Container> {

	private static final long serialVersionUID = 5954870802724663386L;

	public Column(int nContainers){
		Generators.fill(this, Container.generator, nContainers);
	}
}

class Row extends ArrayList<Column> {

	private static final long serialVersionUID = 1L;

	public Row(int nSelves, int nProducts){
		for(int i = 0 ; i < nSelves ; i++) {
			add(new Column(nProducts));
		}
	}
}

class Status {}
class Ship {}
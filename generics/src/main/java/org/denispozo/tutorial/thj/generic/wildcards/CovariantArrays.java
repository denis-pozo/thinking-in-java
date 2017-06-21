package org.denispozo.tutorial.thj.generic.wildcards;

/*
 * Chapter - Generics
 * Section - Wildcards
 * Example
 */

public class CovariantArrays {
	public static void main(String[] args) {
		Fruit [] fruits = new Apple[10];
//		List<Fruit> fruits2 = new ArrayList<Apple>(); Compile time error (instead of Runtime one)
		fruits[0] = new Apple();
		fruits[1] = new Jonathan();
		try {
			// Compiler allows you to add Fruit:
			fruits[0] = new Fruit();
		} catch (Exception e) {
			System.out.println(e);
		}
		try{
			fruits[0] = new Orange();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class Fruit { }
class Apple extends Fruit { }
class Jonathan extends Apple { }
class Orange extends Fruit { }



package org.denispozo.tutorial.thj.holding.objects.iterable;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.denispozo.tutorial.thj.typeinfo.pets.Pet;
import org.denispozo.tutorial.thj.typeinfo.pets.Pets;

/*
 * Chapter - Holding your objects
 * Section - The Adapter Method idiom
 * Exercise 32
 */

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;
			
			public boolean hasNext() {
				return index < pets.length;
			}
			
			public Pet next() {
				return pets[index++];
			}
			
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>(){
					int current = pets.length -1;
					
					@Override
					public boolean hasNext() {
						return current > -1;
					}
				
					@Override
					public Pet next() {
						return pets[current--];
					}
					
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Iterable<Pet> randomized() {
		return new Iterable<Pet>(){
			public Iterator<Pet> iterator() {
				List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	
	
	public static void main(String[] args) {
		NonCollectionSequence c = new NonCollectionSequence();
		
		for(Pet pet : c.reversed()){
			printnr(pet);
		}
		print();
		for(Pet pet : c.randomized()){
			printnr(pet);
		}
		print();
		for(Pet pet : c.pets){
			printnr(pet);
		}
	}
}

class PetSequence {
	protected Pet[] pets = Pets.createArray(8); 
}
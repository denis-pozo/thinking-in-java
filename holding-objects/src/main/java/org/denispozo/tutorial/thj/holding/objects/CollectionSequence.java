package org.denispozo.tutorial.thj.holding.objects;

import java.util.AbstractCollection;
import java.util.Iterator;

import org.denispozo.tutorial.thj.typeinfo.pets.Pet;
import org.denispozo.tutorial.thj.typeinfo.pets.Pets;

/*
 * Chapter - Holding your objects
 * Section - InterfaceVsIterator
 * Book Example
 */

public class CollectionSequence extends AbstractCollection<Pet> {

	private Pet[] pets = Pets.createArray(8);
	
	@Override
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
	
	@Override
	public int size() {
		return pets.length;
	}
	
	public static void main(String[] args) {
		CollectionSequence c = new CollectionSequence();
		
		InterfaceVsIterator.display(c);
		InterfaceVsIterator.display(c.iterator());
	
	}
	
	
}

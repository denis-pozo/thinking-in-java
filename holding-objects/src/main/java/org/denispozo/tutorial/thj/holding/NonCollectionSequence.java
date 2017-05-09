package org.denispozo.tutorial.thj.holding;
//package org.denispozo.tutorial.thj.holding.objects;
//
//import java.util.Iterator;
//
//import org.denispozo.tutorial.thj.typeinfo.pets.Pet;
//import org.denispozo.tutorial.thj.typeinfo.pets.Pets;
//
///*
// * Chapter - Holding your objects
// * Section - InterfaceVsIterator
// * Book Example
// */
//
//public class NonCollectionSequence extends PetSequence {
//
//	public Iterator<Pet> iterator() {
//		return new Iterator<Pet>() {
//			private int index = 0;
//			
//			public boolean hasNext() {
//				return index < pets.length;
//			}
//			
//			public Pet next() {
//				return pets[index++];
//			}
//			
//			public void remove() {
//				throw new UnsupportedOperationException();
//			}
//		};
//	}
//	
//	public static void main(String[] args) {
//		NonCollectionSequence c = new NonCollectionSequence();
//		InterfaceVsIterator.display(c.iterator());
//	
//	}
//}
//
//class PetSequence {
//	
//	protected Pet[] pets = Pets.createArray(8); 
//}
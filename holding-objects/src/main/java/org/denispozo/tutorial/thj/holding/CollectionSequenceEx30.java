package org.denispozo.tutorial.thj.holding;
//package org.denispozo.tutorial.thj.holding.objects;
//
//import java.util.Collection;
//import java.util.Iterator;
//
//import org.denispozo.tutorial.thj.typeinfo.pets.Pet;
//import org.denispozo.tutorial.thj.typeinfo.pets.Pets;
//
///*
// * Chapter - Holding your objects
// * Section - InterfaceVsIterator
// * Exercise 30
// */
//
//public class CollectionSequenceEx30 implements Collection<Pet> {
//
//	private Pet[] pets = Pets.createArray(8);
//	
//	@Override
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
//	@Override
//	public int size() {
//		return pets.length;
//	}
//	
//	@Override
//	public boolean isEmpty() {
//		return (this.size() == 0) ? true : false;
//	}
//
//	@Override
//	public boolean contains(Object o) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public Object[] toArray() {
//		return pets;
//	}
//
//	@Override
//	public <T> T[] toArray(T[] a) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public boolean add(Pet e) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public boolean remove(Object o) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public boolean containsAll(Collection<?> c) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public boolean addAll(Collection<? extends Pet> c) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public boolean removeAll(Collection<?> c) {
//		throw new UnsupportedOperationException();
//	}
//
//	@Override
//	public boolean retainAll(Collection<?> c) {
//		throw new UnsupportedOperationException();
//	}
//
//	@SuppressWarnings("unused")
//	@Override
//	public void clear() {
//		
//		if(this.size() != 0){
//			for(Pet p : pets){
//				p = null;
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		CollectionSequenceEx30 c = new CollectionSequenceEx30();
//		
//		InterfaceVsIterator.display(c);
//		InterfaceVsIterator.display(c.iterator());
//	
//	}
//	
//	
//}

package org.denispozo.tutorial.thj.generics.interfaces.charactershop;

import java.util.Iterator;
import java.util.Random;

import org.denispozo.tutorial.thj.generics.interfaces.Generator;

/*
  * Chapter - Generics
  * Section - Generic Interfaces
  * Exercise 8
  */
public class CharacterGenerator implements Generator<Character>, Iterable<Character> {
	
	private Class<?> [] types = {DonaldRessler.class, ElizabethKeen.class, RaymondReddington.class,
									Solomon.class, TheDirector.class};
		private static Random rand = new Random(47);
	
	public CharacterGenerator() { }
	
	private int size = 0;
	public CharacterGenerator(int size){
		this.size = size;
	}
	
	@Override
	public Character next() {
		try {
			return (Character) types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public Iterator<Character> iterator() {
		return new CharacterIterator();
	}
	
	class CharacterIterator implements Iterator<Character> {
		int count = size;

		@Override
		public boolean hasNext() {
			return count > 0;
		}
		
		@Override
		public Character next() {
			count--;
			return CharacterGenerator.this.next();
		}
		
	}
	
	public static void main(String[] args) {
		CharacterGenerator gen = new CharacterGenerator();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(gen.next());
		}
		
		for(Character c : new CharacterGenerator(5)){
			System.out.println(c);
		}
	}
}

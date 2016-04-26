package org.denispozo.tutorial.thj.holding.objects.ex4;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
 * Chapter - Holding your Objects
 * Section - Printing Containers
 * Exercise 4
 */

public class CharacterNamesGenerator {
	
	private int key = 0;
	
	public String next(){
		switch(key){
			default:
			case 0: key++; return "Snow White";
			case 1: key++; return "Bashful";
			case 2: key++; return "Doc";
			case 3: key++; return "Dopey";
			case 4: key++; return "Grumpy";
			case 5: key++; return "Happy";
			case 6: key++; return "Sleepy";
			case 7: key = 0; return "Sneezy";			
		}
	}
	
	public void fill(String [] array) {
		for(int i = 0 ; i < array.length ; i++){
			array[i] = next();
		}
	}
	
	public Collection<String> fill(Collection<String> collection, int n) {
		
		for(int i = 0 ; i < n ; i++){
			collection.add(next());
		}
		return collection;
	}
	
	public static void main(String[] args) {
		CharacterNamesGenerator gen = new CharacterNamesGenerator();		
		String[] array = new String[10];
		gen.fill(array);
		for(String s : array) System.out.print(s + ", ");
		print();	
		print(gen.fill(new ArrayList<String>(), 10));
		print(gen.fill(new LinkedList<String>(), 10));
		print(gen.fill(new HashSet<String>(), 10));
		print(gen.fill(new LinkedHashSet<String>(), 10));
		print(gen.fill(new TreeSet<String>(), 10));			
	}
	
}

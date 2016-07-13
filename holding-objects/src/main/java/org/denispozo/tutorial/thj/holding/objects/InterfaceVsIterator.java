package org.denispozo.tutorial.thj.holding.objects;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;
import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.denispozo.tutorial.thj.typeinfo.pets.Pet;
import org.denispozo.tutorial.thj.typeinfo.pets.Pets;

/*
 * Chapter - Holding your objects
 * Section - InterfaceVsIterator
 * Book Example
 */

public class InterfaceVsIterator {

	public static void display(Iterator<Pet> it){
	
		while(it.hasNext()){
			Pet p = it.next();
			printnr(p.id() + ":" + p + " ");
		}
		print();
	}
	
	public static void display(Collection<Pet> pets){
		
		for(Pet p : pets) {
			printnr(p.id() + ":" + p + " ");
		}
		print();
	}
	
	public static void main(String[] args) {
		List<Pet> petList = Pets.arrayList(8);
		Set<Pet> petSet = new HashSet<Pet>(petList);
		Map<String, Pet> petMap = new LinkedHashMap<String, Pet>();
		String [] names = ("Ralph, Eric, Robin, Lacey, Britney, Sam, Spot, Fluffy").split(", ");
		
		for(int i = 0 ; i < names.length ; i++){
			petMap.put(names[i], petList.get(i));
		}
		
		display(petList);
		display(petSet);
		display(petList.iterator());
		display(petSet.iterator());
		print(petMap);
		print(petMap.keySet());
		display(petMap.values());
		display(petMap.values().iterator());
		
	}
}

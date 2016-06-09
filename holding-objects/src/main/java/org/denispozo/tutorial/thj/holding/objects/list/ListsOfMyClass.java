package org.denispozo.tutorial.thj.holding.objects.list;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Chapter - Holding your Objects
 * Section - Lists
 * Exercise 7
 */

public class ListsOfMyClass {
	
	public static void main(String [] args){
		MyClass [] myClassArray = new MyClass[]{new MyClass("Denis"), new MyClass("Alice"), new MyClass("Bob")};
		print("1: array " + myClassArray);
		List<MyClass> list = new ArrayList<MyClass>();
		print("2: list " + list);
		list.addAll(Arrays.asList(myClassArray));
		print("3: fulfilled list " + list);
		List<MyClass> sub = list.subList(0, 1);
		print("4: sublist " + sub);
		for(MyClass cl : sub) list.remove(cl);
		print("5: list - sublist " + list);
	}

}

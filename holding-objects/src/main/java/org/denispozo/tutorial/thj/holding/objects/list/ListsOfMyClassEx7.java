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

public class ListsOfMyClassEx7 {
	
	public static void main(String [] args){
		MyClassEx7 [] myClassArray = new MyClassEx7[]{new MyClassEx7("Denis"), new MyClassEx7("Alice"), new MyClassEx7("Bob")};
		print("1: array " + myClassArray);
		List<MyClassEx7> list = new ArrayList<MyClassEx7>();
		print("2: list " + list);
		list.addAll(Arrays.asList(myClassArray));
		print("3: fulfilled list " + list);
		List<MyClassEx7> sub = list.subList(0, 1);
		print("4: sublist " + sub);
		for(MyClassEx7 cl : sub) list.remove(cl);
		print("5: list - sublist " + list);
	}

}

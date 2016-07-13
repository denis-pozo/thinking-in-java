package org.denispozo.tutorial.thj.holding.objects.list.linked;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Chapter - Holding your objects
 * Section - LinkedList
 * Exercise 14
 */

public class InTheMiddleInsertListEx14 {
	
	static void addMiddle(LinkedList<Integer> l, Integer[] ia) {
		
		for(Integer i : ia) {
			ListIterator<Integer> it = l.listIterator((l.size())/2);
				it.add(i);
				print(l);
			}
		}
	
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		Integer[] x = {0, 1, 2, 3, 4, 5, 6, 7};
		InTheMiddleInsertListEx14.addMiddle(li, x);
	}
}
	
//	LinkedList<Integer> list;
//	ListIterator<Integer> iterator;
//	boolean next = true;
//	
//	public InTheMiddleInsertList() {
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		iterator = list.listIterator();
//	}
//
//	private void insert(int nextInt) {
//		
//		if(next){
//			list.add(nextInt, iterator.nextIndex());
//		}else{
//			list.add(nextInt, iterator.previousIndex());
//		}
//		
//		print("Added " + nextInt);
//	}
//	
//	public static void main(String[] args) {
//		Random random = new Random(34);
//		InTheMiddleInsertList l = new InTheMiddleInsertList();
//		
//		for(int i = 0 ; i < 10 ; i++){
//			l.insert(random.nextInt(100));
//		}
//		
//		print(l);
//	}


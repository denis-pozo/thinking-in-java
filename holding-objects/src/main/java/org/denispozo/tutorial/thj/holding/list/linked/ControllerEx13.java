package org.denispozo.tutorial.thj.holding.list.linked;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Chapter - Holding your objects
 * Section - LinkedList
 * Exercise 13
 */

public class ControllerEx13 {

private List<EventEx13> eventList = new LinkedList<EventEx13>();
	
	public void addEvent(EventEx13 event) {
		eventList.add(event);
	}
	
	public void run() {
		LinkedList<EventEx13> eventListCopy = 
				new LinkedList<EventEx13>(eventList);
			ListIterator<EventEx13> it 
				= eventListCopy.listIterator();
			while(it.hasNext()) {	
				it.next().action();
				it.previous();		
				System.out.println(it.next());		
			}
	}
}

package org.denispozo.tutorial.thj.holding.objects.ex13;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * Chapter - Holding your objects
 * Section - LinkedList
 * Exercise 13
 */

public class Controller {

private List<Event> eventList = new LinkedList<Event>();
	
	public void addEvent(Event event) {
		eventList.add(event);
	}
	
	public void run() {
		LinkedList<Event> eventListCopy = 
				new LinkedList<Event>(eventList);
			ListIterator<Event> it 
				= eventListCopy.listIterator();
			while(it.hasNext()) {	
				it.next().action();
				it.previous();		
				System.out.println(it.next());		
			}
	}
}

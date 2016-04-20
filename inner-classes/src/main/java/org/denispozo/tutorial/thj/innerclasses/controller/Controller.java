package org.denispozo.tutorial.thj.innerclasses.controller;

import static org.denispozo.tutorial.thj.util.Print.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Inner Classes
 * Section - Inner Classes and Control Frameworks
 * Example
 */

public class Controller {

	private List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event event) {
		eventList.add(event);
	}
	
	public void run() {
		while(eventList.size() > 0){
			/* Make a copy so you're not modifying the list 
			 * while you're selecting the elements in it: */
			for(Event event : new ArrayList<Event>(eventList)){
				if(event.ready()){
					print(event);
					event.action();
					eventList.remove(event);
				}
				
			}
		}
	}

}

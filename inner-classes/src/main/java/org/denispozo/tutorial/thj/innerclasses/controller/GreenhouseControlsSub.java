package org.denispozo.tutorial.thj.innerclasses.controller;

/*
 * Chapter - Inner Classes
 * Section - Inner Classes and Control Frameworks
 * Exercise 25
 */

public class GreenhouseControlsSub  extends GreenhouseControls {
	
	@SuppressWarnings("unused")
	private boolean waterMist = false;
	public class WaterMistOn extends Event {
		
		public WaterMistOn(long delayTime) {
			super(delayTime);
		}
		
		public void action() {
			// Put hardware control code here
			waterMist = true;
		}
		
		public String toString() {
			return "Water mist generator is on";
		}
	}
	
	public class WaterMistOff extends Event {
		
		public WaterMistOff(long delayTime){
			super(delayTime);
		}
		
		public void action() {
			// Put hardware control code here 
			waterMist = false;
		}
		
		public String toString() {
			return "Water mist generator is off";
		}
	}

}

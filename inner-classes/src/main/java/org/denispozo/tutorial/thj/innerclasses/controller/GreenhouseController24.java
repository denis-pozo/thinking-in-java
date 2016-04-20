package org.denispozo.tutorial.thj.innerclasses.controller;

/*
 * Chapter - Inner Classes
 * Section - Inner Classes and Control Frameworks
 * Exercise 24
 */

public class GreenhouseController24 {
	
	public static void main(String [] args){
		GreenhouseControls gc = new GreenhouseControls();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		
		Event [] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new WaterOff(800),
				gc.new FanOn(700),
				gc.new FanOff(1000),
				gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		
		if(args.length == 1){
			gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
		}
		gc.run();
	}

}

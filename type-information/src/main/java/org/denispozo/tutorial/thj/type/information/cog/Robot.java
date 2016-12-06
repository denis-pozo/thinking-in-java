package org.denispozo.tutorial.thj.type.information.cog;

import java.util.List;

import org.denispozo.tutorial.thj.util.Null;

/*
 * Chapter - Type Information
 * Section - The Null Object
 * Example
 */

public interface Robot {
	
	String name();
	String model();
	List<Operation> opterations();
	
	class Test {
		public static void test(Robot r){
			if(r instanceof Null){
				System.out.println("[Null Robot]");
			}
			System.out.println("Robot name: " + r.name());
			System.out.println("Robot model: " + r.model());
			for(Operation operation : r.opterations()){
				System.out.println(operation.description());
				operation.command();
			}
		}
	}
}

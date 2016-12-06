package org.denispozo.tutorial.thj.type.information.cog;

import java.util.Arrays;
import java.util.List;

/*
 * Chapter - Type Information
 * Section - The Null Object
 * Example
 */

public class SnowRemovalRobot implements Robot {

	private String name;
	
	public SnowRemovalRobot(String name) {
		this.name = name;
	}
	
	@Override
	public String name() {
		return name;
	}

	@Override
	public String model() {
		return "SnowBot Series 11";
	}

	@Override
	public List<Operation> opterations() {
		return Arrays.asList(
				new Operation() {
					@Override
					public String description() {
						return name + " can shovel snow";
					}
					@Override
					public void command() {
						System.out.println(name + " shoveling snow");
					}
				},
				new Operation() {

					@Override
					public String description() {
						return name + " can chip ice";
					}

					@Override
					public void command() {
						System.out.println(name + " chipping ice");
					}
				},
				new Operation() {

					@Override
					public String description() {
						return name + " can clear the roof";
					}

					@Override
					public void command() {
						System.out.println(name + " clearing the roof");
					}
					
				}
		);
	}
	
	public static void main(String[] args) {
		Robot.Test.test(new SnowRemovalRobot("Slusher"));
	}
}

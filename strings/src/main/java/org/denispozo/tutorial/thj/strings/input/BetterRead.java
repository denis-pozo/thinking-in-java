package org.denispozo.tutorial.thj.strings.input;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.Scanner;

/*
 * Chapter - Strings
 * Section - Scanning Input
 * Example
 */

public class BetterRead {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(SimpleRead.input);
		
		print("What is your name?");
		String name = stdin.nextLine();
		print(name);
		print("How old are you? What is your favorite double?");
		print("(input: <age> <double>)");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		System.out.format("Hi %s. \n", name);
		System.out.format("In 5 years you will be %d.\n", age + 5);
		System.out.format("My favorite double is %f\n", favorite / 2);
	}
	
}
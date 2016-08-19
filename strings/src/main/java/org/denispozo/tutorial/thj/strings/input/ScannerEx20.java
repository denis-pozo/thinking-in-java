package org.denispozo.tutorial.thj.strings.input;

import java.util.Scanner;

/*
 * Chapter - Strings
 * Section - Scanning Input
 * Exercise 20
 */

public class ScannerEx20 {
	
	int i;
	long L;
	float f;
	double d;
	String s;
	
	ScannerEx20(String s) {
		Scanner sc = new Scanner(s);
		i = sc.nextInt();
		L = sc.nextLong();
		f = sc.nextFloat();
		d = sc.nextDouble();
		this.s = sc.next(); 		
		sc.close();
	}
	
	public String toString() {
		return i + " " + L + " " + f + " " + d + " " + s;
	}
	
	public static void main(String[] args) {
		ScannerEx20 s20 = new ScannerEx20("17 56789 2.7 3.61412 hello");
		System.out.println(s20);
	}
	
}
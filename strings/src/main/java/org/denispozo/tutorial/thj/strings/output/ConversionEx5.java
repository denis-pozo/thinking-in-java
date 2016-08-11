package org.denispozo.tutorial.thj.strings.output;

import java.math.BigInteger;
import java.util.Formatter;

/*
 * Chapter - Strings
 * Section - Formatter Conversions
 * Exercise 5
 */

public class ConversionEx5 {
	
	public static void main(String[] args) {
		Formatter f = new Formatter(System.out);
		
		try{
			char u = 'a';
			System.out.println("u = 'a'");
			f.format("%-2s%-2S\n", u, u);
			f.format("%-2c%-2C\n", u, u);
			f.format("%-5b%-5B\n", u, u);
			f.format("%-3h%-3H\n", u, u);
			System.out.println();
			
			int v = 121;
			System.out.println("v = 121");
			f.format("%-4s%-4S\n", v, v);
			f.format("%-4d\n", v);
			f.format("%-4c%-4C\n", v, v);
			f.format("%-5b%-5B\n", v, v);
			f.format("%-4x%-4X\n", v, v);
			f.format("%-4h%-4H\n", v,v);
			System.out.println();

			BigInteger w = new BigInteger("50000000000000");
			System.out.println("w = new BigInteger(\"50000000000000\")");
			f.format("%-15s%-15S\n", w,w);
			f.format("%-5b%-5B\n", w,w);
			f.format("%-15x%-15X\n", w,w);
			f.format("%-5h%-5H\n", w,w);
			System.out.println();
			
			double x = 179.543;
			System.out.println("x = 179.543");
			f.format("%-8s%-8S\n", x,x);
			f.format("%-5b%-5B\n", x,x);
			f.format("%-15f\n", x);
			f.format("%-15e%-15E\n", x,x);
			f.format("%-12h%-12H\n", x,x);
			System.out.println();

			ConversionEx5 y = new ConversionEx5();
			System.out.println("y = new Conversion()");
			f.format("%-20s%-20S\n", y,y);
			f.format("%-5b%-5B\n", y,y);
			f.format("%-10h%-10H\n", y,y);
			System.out.println();
			
			boolean z = false;
			System.out.println("z = false");
			f.format("%-7s%-7S\n", z,z);
			f.format("%-7b%-7B\n", z,z);
			f.format("%-7h%-7H\n", z,z);
			System.out.println();
			
		} finally {
			f.close();
		}
	}
	
}
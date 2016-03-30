package org.denispozo.tutorial.thj.interfaces.scanner;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/*
 * Chapter - Interfaces
 * Section - Adapting to an interface
 * Exercise 16
 */

public class AdaptedRandomChars extends RandomChars implements Readable {
	
	private int count;
	
	public AdaptedRandomChars(int count) {
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {

		if(count -- == 0) {
			return -1;
		}
		
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(new AdaptedRandomChars(10));
		while(scanner.hasNext()){
			System.out.print(scanner.next());
		}
		scanner.close();
	}

	
}

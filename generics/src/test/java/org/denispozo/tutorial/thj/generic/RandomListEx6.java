package org.denispozo.tutorial.thj.generic;

import static org.denispozo.tutorial.thj.util.PrintUtil.printnr;

import org.denispozo.tutorial.thj.generics.RandomList;

/*
 * Chapter - Generics
 * Section - RandomList
 * Exercise 6
 */

public class RandomListEx6<T> {
	
	public static void main(String[] args) {
		RandomList<Integer> rli = new RandomList<Integer>();
		for(int i = 0 ; i < 10 ; i++ ){
			rli.add(i);
		}
		
		for(int i = 0 ; i < 15 ; i++) {
			printnr(rli.select() + " ");
		}
		
		RandomList<Boolean> rlb = new RandomList<Boolean>();
		for(int i = 0 ; i < 10 ; i++ ){
			rlb.add(i % 2 == 0);
		}
		
		for(int i = 0 ; i < 15 ; i++) {
			printnr(rlb.select() + " ");
		}
	}
}

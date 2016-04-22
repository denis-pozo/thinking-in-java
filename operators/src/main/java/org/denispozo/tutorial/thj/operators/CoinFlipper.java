package org.denispozo.tutorial.thj.operators;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import java.util.Random;

//Chapter - Operators: Exercise 7

public class CoinFlipper {
	
	public enum Coin{
		HEAD,
		TAILS
	}

	Random randomGen;
	
	public CoinFlipper(){
		randomGen = new Random();	
	}
	
	public Coin throwIt(){
		if(randomGen.nextBoolean()){
			return Coin.HEAD;
		} else {
			return Coin.TAILS;
		}
	}
		
	public static void main(String ... args){
		
		print("Throwing the coin: ");
		CoinFlipper cFlipper = new CoinFlipper();
		
		for(int i = 0 ; i < 20 ; i++){
			print(String.format("Play %d: %s", i+1, cFlipper.throwIt()));
		}
	}
	
	
}

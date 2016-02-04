package org.denispozo.tutorial.thj.four.uExerciseTwentyone;

import static org.denispozo.tutorial.thj.util.Print.*;

public class Main {

	public static void main(String[] args) {
		for(PaperCurrency pc : PaperCurrency.values()){
			print(pc.toString());
			print(pc.ordinal());
		}

	}

}

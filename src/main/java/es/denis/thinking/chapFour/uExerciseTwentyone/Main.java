package es.denis.thinking.chapFour.uExerciseTwentyone;

import static es.denis.thinking.utils.Print.*;

public class Main {

	public static void main(String[] args) {
		for(PaperCurrency pc : PaperCurrency.values()){
			print(pc.toString());
			print(pc.ordinal());
		}

	}

}

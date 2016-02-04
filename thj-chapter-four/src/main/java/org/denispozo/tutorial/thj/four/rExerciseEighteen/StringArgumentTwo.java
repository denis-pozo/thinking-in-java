package org.denispozo.tutorial.thj.four.rExerciseEighteen;

import static org.denispozo.tutorial.thj.util.Print.*;

	public class StringArgumentTwo {
		
		public StringArgumentTwo(String str){
			print("Hey, " + str);
		}

		public static void main(String[] args) {
			StringArgumentTwo [] str = new StringArgumentTwo[2];
			str[0] = new StringArgumentTwo("First comes first");
			str[1] = new StringArgumentTwo("Second comes second");

		}

}

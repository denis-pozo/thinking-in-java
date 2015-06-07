package es.denis.thinking.chapFour.rExerciseEighteen;

import static es.denis.thinking.utils.Print.*;

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

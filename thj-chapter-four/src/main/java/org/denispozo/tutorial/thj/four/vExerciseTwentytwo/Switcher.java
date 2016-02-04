package org.denispozo.tutorial.thj.four.vExerciseTwentytwo;

import static org.denispozo.tutorial.thj.util.Print.*;
import org.denispozo.tutorial.thj.four.uExerciseTwentyone.PaperCurrency;

public class Switcher {

	public static void switching(PaperCurrency pc){
		
		switch(pc){
		case DONG:
			print("You need about 33,000 dong to buy just £1");
			break;
		case INDO_RUPIA:
			print("The Indonesian rupiah, which has an exchange rate of about 15,300 against the pound");
			break;
		case COL_PESO:
			print("You would need 2,880 of them to buy a single £1 coin");
			break;
		case TANZ_SHILLING:
			print("The Tanzanian shilling is slightly more valuable, with an exchange rate of around 2,500 against sterling");
			break;
		case SOUTHKOREA_WON:
			print("South Korean's won is valued at about 1,730 to the pound");
			break;
		case CHILE_PESO:
			print("The Chilean peso is the sixth least valuable unit of currency – 760 are equivalent to £1");
			break;
		}
	}

	public static void main(String[] args) {
		for(PaperCurrency pc : PaperCurrency.values()){
			switching(pc);
		}

	}

}

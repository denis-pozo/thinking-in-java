package org.denispozo.tutorial.thj.initcleanup;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

import org.denispozo.tutorial.thj.initialization.enums.PaperCurrency;

public class PaperCurrencyTest {

	public static void main(String[] args) {
		for(PaperCurrency pc : PaperCurrency.values()){
			print(pc.toString());
			print(pc.ordinal());
		}

	}

}

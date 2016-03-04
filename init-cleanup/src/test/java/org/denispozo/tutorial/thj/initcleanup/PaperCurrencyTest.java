package org.denispozo.tutorial.thj.initcleanup;

import static org.denispozo.tutorial.thj.util.Print.*;

import org.denispozo.tutorial.thj.initcleanup.PaperCurrency;

public class PaperCurrencyTest {

	public static void main(String[] args) {
		for(PaperCurrency pc : PaperCurrency.values()){
			print(pc.toString());
			print(pc.ordinal());
		}

	}

}

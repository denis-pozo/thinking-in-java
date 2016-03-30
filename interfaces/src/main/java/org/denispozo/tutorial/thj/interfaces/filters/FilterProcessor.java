package org.denispozo.tutorial.thj.interfaces.filters;

import org.denispozo.tutorial.thj.interfaces.classprocessor.Apply;

public class FilterProcessor {

	public static void main(String [] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(1000.0)), w);
		Apply.process(new FilterAdapter(new BandPass(1.0, 4.0)), w);
	}
}

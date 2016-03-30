package org.denispozo.tutorial.thj.interfaces.filters;

import org.denispozo.tutorial.thj.interfaces.classprocessor.Processor;

public class FilterAdapter implements Processor {

	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
	}
}

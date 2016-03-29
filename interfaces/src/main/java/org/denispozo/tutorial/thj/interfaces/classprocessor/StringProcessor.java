package org.denispozo.tutorial.thj.interfaces.classprocessor;

public abstract class StringProcessor implements Processor {
	
	public static String s = "If she weights the same as a duck, she's made of wood";
	
	@Override
	public String name() {
		return getClass().getSimpleName();
	}
	
	@Override
	public abstract String process(Object input);
	
	public static void main(String [] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
		Apply.process(new Swapper(), s);
	}

}

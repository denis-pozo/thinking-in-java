package org.denispozo.tutorial.thj.one;

public class StaticFieldDemostration {

	public static void main(String[] args) {
		System.out.println("Exercice 8: Demostrate the behavior of the static attributes");
		Incrementable sf = new Incrementable();
		System.out.println("i = " + sf.i);
		Incrementable.increment();
		System.out.println("i = " + sf.i);
		Incrementable sf2 = new Incrementable();
		System.out.println("i = " + sf2.i);

	}
}

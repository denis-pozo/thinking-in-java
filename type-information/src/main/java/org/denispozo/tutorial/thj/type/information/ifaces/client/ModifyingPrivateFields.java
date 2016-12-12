package org.denispozo.tutorial.thj.type.information.ifaces.client;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.reflect.Field;

/*
 * Chapter - Type Information
 * Section - Interfaces and type information
 * Example
 */

public class ModifyingPrivateFields {

	public static void main(String[] args) throws Exception {
		WithPrivateFinalField pf = new WithPrivateFinalField();
		print(pf);
		
		Field f = pf.getClass().getDeclaredField("i");
		f.setAccessible(true);
		print("f.getInt(pf): " + f.getInt(pf));
		f.setInt(pf, 47);
		print(pf);
		f = pf.getClass().getDeclaredField("s");
		f.setAccessible(true);
		print("f.get(pf): " + f.get(pf));
		f.set(pf, "No you are not!");
		print(pf);
		f = pf.getClass().getDeclaredField("s2");
		f.setAccessible(true);
		print("f.get(pf): " + f.get(pf));
		f.set(pf,  "No, you are not!");
		print(pf); 
	}
}

class WithPrivateFinalField {
	private int i = 1;
	private final String s = "I'm totally safe";
	private String s2 = "Am I safe?";
	
	public String toString() {
		return "i = " + i + ", " + s + ", " + s2;
	}
}
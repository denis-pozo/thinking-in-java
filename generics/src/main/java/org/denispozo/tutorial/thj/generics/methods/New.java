package org.denispozo.tutorial.thj.generics.methods;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/*
 * Chapter - Generics
 * Section - Leveraging type argument inference
 * Example
 */

public class New {
	
	public static <K,V> Map<K,V> map() {
		return new HashMap<K,V>();
	}
	
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> lList() {
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set() {
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue() {
		return new LinkedList<T>();		
	}
	
	public static <T> GenerizerEx11<T> generizer() {
		return new GenerizerEx11<T>();
	}
	
	public static void main(String[] args) {
		Map<String, List<String>> ls = New.map();
		print(ls.getClass());
		GenerizerEx11<String> gen = New.generizer();
		gen.setField("Car");
		print(gen.getField());
	}
	
	
}

package org.denispozo.tutorial.thj.type.information.reflection;

import static org.denispozo.tutorial.thj.util.PrintUtil.print;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern; 

/*
 * Chapter - Type Information
 * Section - Reflection: runtime class information
 * Exercise 18
 */

class ShowMethodsEx18 {
	private static String usage = 
			"Usage:\n" +
			"ShowMethods qualified .class.name\n" +
			"To show all methdos in class or: \n" +
			"ShowMethods qualified.class.name word \n" +
			"To search for methods involving 'word'";
	
	private static Pattern p = Pattern.compile("\\w+\\.|\\s*final|\\s*native");
	
	public static void main(String [] args) {
		
		if(args.length < 1){
			print(usage);
			System.exit(0);
		}
		
		
		try{
			Class<?> c = Class.forName(args[0]);
			Method [] methods = c.getMethods();
			Constructor<?> [] constructors = c.getConstructors();
			@SuppressWarnings("unused")
			int lines = 0;
			if(args.length == 1) {
				for(Method method : methods) {
					print(p.matcher(method.toString()).replaceAll(""));
				}for(Constructor<?> constructor : constructors){
						print(p.matcher(constructor.toString()).replaceAll(""));
				}
				lines = methods.length + constructors.length;
			} else {
				for(Method method : methods){
					if(method.toString().indexOf(args[1]) != -1) {
						print(p.matcher(method.toString()).replaceAll(""));
						lines ++;
					}
				}
				for(Constructor<?> constructor : constructors){
					if(constructor.toString().indexOf(args[1]) != -1){
						print(p.matcher(constructor.toString()).replaceAll(""));
						lines ++;
					}
				}
			}
		} catch (ClassNotFoundException cnfe) {
			print("No such class: " + cnfe);
		}
	}
}

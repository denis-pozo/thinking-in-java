package org.denispozo.tutorial.thj.util;

public class PrintUtil {
	
	public static void print(String string){
		System.out.println(string);
	}
	
	public static void print(Object object){
		print(object.toString());
	}
	
	public static void print(){
		print("");
	}
		
	public static void print(int i){
		print("" + i);
	}
	
	public static void print(float f){
		print("" + f);
	}
	
	public static void print(double d){
		print("" + d);
	}
	
	public static void print(long l){
		print("" + l);
	}
	
	public static void printnr(String string){
		System.out.print(string + " ");
	}
	
	public static void printnr(Object object){
		printnr(object.toString());
	}
	
	public static void printnr(){
		printnr("");
	}
		
	public static void printnr(int i){
		printnr("" + i);
	}
	
	public static void printnr(float f){
		printnr("" + f);
	}
	
	public static void printnr(double d){
		printnr("" + d);
	}
	
	public static void printnr(long l){
		printnr("" + l);
	}
}

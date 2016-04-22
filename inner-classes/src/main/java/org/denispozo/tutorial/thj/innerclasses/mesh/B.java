package org.denispozo.tutorial.thj.innerclasses.mesh;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

/*
 * Chapter - Inner Classes
 * Section - Why inner classes?
 * Exercise 23
 */

public class B {
	
	private U [] uuu;
	private int count = 0;
	
	public B(){
		uuu = new U[10];
	}
	
	public void addU(U u){
		
		if(count < uuu.length){
			uuu[count++] = u;
			print(u + " has been added to the array");
		}
	}
	
	public void setNull(int index){
		
		if(index < uuu.length){
			uuu[index] = null;
			print("Reference in position " + index + " was set to null");
		}
	}
	
	public void execute(){
		
		for(U u : uuu){
			if(u != null){
				u.one();
				u.two();
				u.three();
			}
		}
	}
	
	

}

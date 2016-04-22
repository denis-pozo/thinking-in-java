package org.denispozo.tutorial.thj.controlling.execution;

import static org.denispozo.tutorial.thj.util.PrintUtil.*;

//Chapter - Controlling Execution: Exercise 010

public class VampireNumberFourDigits {
	
	public static void main(String ... args){
		int a;
		for(int i = 1 ; i < 9 ; i++){
			for(int j = 0 ; j < 9 ; j++){
				for(int k = 0 ; k < 9 ; k++){
					for(int z = 0 ; z < 9 ; z++){
						a = (i*10 + j) * (k*10 + z);
						if(a < 10000 && a > 999){
							if(isItVampire(i,j,k,z,a)){
								print("Vampire number: " + (i*10 + j) + " * " + (k*10 + z) + " = " + a);
							}
						}
					}
				}
			}
		}
		
		
	}
	
	public static boolean isItVampire(int i, int j, int k, int z, int vampire){
		int [] vampireArray = convertToArray(vampire);
		int [] numbers = {i,j,k,z};
		
		if(isVampire(vampireArray, numbers)){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isVampire(int [] vArray, int [] numb){
		int [] vArrayCopy = new int [vArray.length-1];
		
		boolean flag = false;
		
		if(vArray.length == 1){
			if(vArray[0] == numb[0]){
				return true;
			} else {
				return false;
			}
		}
		
		
		for(int i = 0 ; i < numb.length ; i ++){
			if(vArray[i] == numb[0]){
				flag = true;
			}else{
				if(flag){
					vArrayCopy[i-1] = vArray[i];
				}else{
					if(i == vArray.length-1){
						return false;
					}
					vArrayCopy[i] = vArray[i];
				}
			}
		}
		
		
		
		
		if(flag){
			int [] numbCopy = new int [numb.length-1];
			for(int i = 0 ; i < numbCopy.length ; i++){
				numbCopy[i] = numb[i+1];
			}
			if(isVampire(vArrayCopy, numbCopy)){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public static int [] convertToArray(int vampire){
		int a = vampire / 1000;
		int b = (vampire / 100) % 10;
		int c = (vampire / 10) % 10;
		int d = (vampire % 10);
		
		int [] vampireArray = {a,b,c,d};
		return vampireArray;
	}
	
}

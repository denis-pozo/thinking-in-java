package org.denispozo.tutorial.thj.generic.wildcards;

/*
 * Chapter - Generics
 * Section - Wildcards
 * Exercise 26
 */

public class ArrayCovarianceEx26 {
    public static void main(String[] args) {
        Number [] numbers = new Integer[2];
        numbers[0] = new Integer(23);
        numbers[1] = new Integer(53);
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }
        try { // compile OK; runtime ArrayStoreException:
            numbers[1] = new Double(3.4);
        } catch(Exception e) {
            System.out.println(e);
        }

        for(Number n : numbers){
            System.out.println(n);
        }
        for(Number n : numbers){
            System.out.println(n.getClass().getSimpleName());
        }
    }
}



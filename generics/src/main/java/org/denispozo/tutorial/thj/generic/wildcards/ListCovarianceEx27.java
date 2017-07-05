package org.denispozo.tutorial.thj.generic.wildcards;

/*
 * Chapter - Generics
 * Section - Wildcards
 * Exercise 27
 */

import java.util.ArrayList;
import java.util.List;

public class ListCovarianceEx27 {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<Number>();

        List<? extends Number> numbers2 = new ArrayList<Integer>();
        numbers.add(new Integer(23));
        numbers.add(new Integer(53));

        numbers.add(new Integer(23));
        numbers.add(new Integer(53));
        try { // compile OK; runtime ArrayStoreException:
            numbers.add(new Double(3.4));
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



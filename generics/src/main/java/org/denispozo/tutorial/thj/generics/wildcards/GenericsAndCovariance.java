package org.denispozo.tutorial.thj.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

/*
 * Chapter - Generics
 * Section - Wildcards
 * Example
 */
public class GenericsAndCovariance {

    public static void main(String [] args) {
        // Wildcards allow for covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();

        // Compile error: Can't add any type of object:
        // flist.add(new Apple());
        // flist.add(new Fruit());
        // flist.add(new Object());
        flist.add(null);
        Fruit f = flist.get(0);
    }


}

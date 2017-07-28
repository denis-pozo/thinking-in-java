package org.denispozo.tutorial.thj.generics.wildcards;

import java.util.Arrays;
import java.util.List;

/*
 * Chapter - Generics
 * Section - Wildcards
 * Example
 */

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}



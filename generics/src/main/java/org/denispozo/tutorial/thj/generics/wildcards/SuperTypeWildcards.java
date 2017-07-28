package org.denispozo.tutorial.thj.generics.wildcards;

import java.util.List;

public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        apples.add(new Jonathan());
        // apples.add(new Fruit()); Error
    }
}

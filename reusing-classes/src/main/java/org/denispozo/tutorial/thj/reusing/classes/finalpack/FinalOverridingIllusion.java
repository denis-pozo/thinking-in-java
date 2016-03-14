package org.denispozo.tutorial.thj.reusing.classes.finalpack;

import static org.denispozo.tutorial.thj.util.Print.*; 

/*
 * Chapter - Reusing Classes
 * Section - Final and Private
 * Exercise 20 and 21
 */

@SuppressWarnings("unused")
class WithFinals {
    private void f() { print("f()"); }
    private final void g() { print("g()"); }
    final void h() { print("h()"); }
    public void j() { print("j()"); }
    public void k() { print("k()"); }
}

@SuppressWarnings("unused")
class Overriding extends WithFinals {
    // @Override // override isn't possible here because original method is private
    private void f() { print("ef()"); }
    // @Override // original method is private
    private void g() { print("eg()"); }
    // @Override // original method is final
    // void h() { System.out.println("eh()"); }
    @Override
    public void j() { print("ej()"); }
    public void k() { print("ek()"); }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        Overriding b = new Overriding();
        //b.f(); // can't call private method
        //b.g() // can't call private method;
        b.h();
        b.j();
        b.k();
        WithFinals a = b;
        //a.f(); // can't call private method
        //a.g(); // can't call private method
        a.h();
        a.j();
        b.k();
    }
}

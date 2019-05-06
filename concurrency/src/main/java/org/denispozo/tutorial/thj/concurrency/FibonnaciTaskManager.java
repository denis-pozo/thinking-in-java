package org.denispozo.tutorial.thj.concurrency;

import org.denispozo.tutorial.thj.generics.interfaces.Fibonacci;

import static java.lang.Thread.yield;

class FibonacciTask implements Runnable {
    private final int n;

    public FibonacciTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int count = 0;
        Fibonacci fib = new Fibonacci();
        while(count++ < n) {
            System.out.println(fib.next());
            yield();
        }

        System.out.println("Task for calculating " + n + " fibonacci numbers finished");
    }
}

public class FibonnaciTaskManager {
    public static void main (String [] args) {
        Thread t1 = new Thread(new FibonacciTask(43));
        Thread t2 = new Thread(new FibonacciTask(9));
        t1.start();
        t2.start();
    }



}


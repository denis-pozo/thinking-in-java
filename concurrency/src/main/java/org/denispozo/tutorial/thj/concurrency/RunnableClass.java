package org.denispozo.tutorial.thj.concurrency;

//Chapter - Concurrency: Exercise 1 (1/2)

import static java.lang.Thread.yield;

public class RunnableClass implements Runnable {

    public RunnableClass() {
        System.out.println("Init Runnable Class...");
    }

    @Override
    public void run() {
        int reps = 3;
        while(reps-- > 0) {
            System.out.println("Task #" + (reps+1) + " fulfilled. Remaining tasks: " + reps);
            yield();
        }

        System.out.println("Task of runnable class done. Exiting...");
    }
}

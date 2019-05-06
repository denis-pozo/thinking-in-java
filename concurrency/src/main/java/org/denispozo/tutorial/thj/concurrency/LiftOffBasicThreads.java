package org.denispozo.tutorial.thj.concurrency;

//Chapter - Concurrency: Example 002

public class LiftOffBasicThreads {
    public static void main(String [] args) {
        Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.println("Waiting for LiftOff");
    }
}

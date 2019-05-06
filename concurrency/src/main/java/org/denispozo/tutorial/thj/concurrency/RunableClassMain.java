package org.denispozo.tutorial.thj.concurrency;

//Chapter - Concurrency: Exercise 1 (2/2)

public class RunableClassMain {
    public static void main(String [] args) {
        Runnable runnableA = new RunnableClass();
        Runnable runnableB = new RunnableClass();
        Runnable runnableC = new RunnableClass();
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        Thread threadC = new Thread(runnableC);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}

package org.denispozo.tutorial.thj.concurrency;

//Chapter - Concurrency: Main class examples 001 - 003

public class LiftOffMainThread {
    public static void main(String [] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}

package org.denispozo.tutorial.thj.concurrency;

public class LiftOffMainThread {
    public static void main(String [] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}

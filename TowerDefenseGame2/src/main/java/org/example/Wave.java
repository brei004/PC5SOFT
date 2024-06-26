package org.example;

public class Wave {
    private boolean started;

    public Wave() {
        this.started = false;
    }

    public void start() {
        this.started = true;
        System.out.println("Oleada iniciada!");
    }

    public boolean isStarted() {
        return started;
    }
}

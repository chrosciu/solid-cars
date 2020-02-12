package com.chrosciu.guice;

public class WaxCarWash {
    public void wash() {
        washBody();
        washWindows();
        waxBody();
    }

    private void washBody() {
        System.out.println("Washing body");
    }

    private void washWindows() {
        System.out.println("Washing windows");
    }

    private void waxBody() {
        System.out.println("Waxing body");
    }
}

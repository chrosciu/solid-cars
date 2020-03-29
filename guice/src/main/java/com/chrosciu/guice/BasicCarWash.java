package com.chrosciu.guice;

public class BasicCarWash implements Washing {
    @Override
    public void wash() {
        washBody();
        washWindows();
    }

    private void washBody() {
        System.out.println("Washing body");
    }

    private void washWindows() {
        System.out.println("Washing windows");
    }
}

package com.chrosciu.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Main {
    public static void main(String[] args) {
        Module module = new CarCareModule();
        Injector injector = Guice.createInjector(module);
        CarCare carCare = injector.getInstance(CarCare.class);
        carCare.care();
    }
}

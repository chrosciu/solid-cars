package com.chrosciu.guice;

import com.google.inject.AbstractModule;

public class CarCareModule extends AbstractModule {
    @Override
    public void configure() {
        bind(LiquidChecking.class).to(LiquidCheck.class);
        bind(Washing.class).to(VaxCarWash.class);
        bind(Vacuuming.class).to(Vacuum.class);
    }
}

package com.chrosciu.ocp;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new InMemoryCarRepository();
        CarSearch carSearch = new CarSearch(carRepository);
        System.out.println(carSearch.findByName("Fiat Punto"));
        System.out.println(carSearch.findByMaxPrice(1500));
    }
}

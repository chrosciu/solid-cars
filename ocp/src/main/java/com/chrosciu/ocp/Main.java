package com.chrosciu.ocp;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new InMemoryCarRepository();
        CarSearch carSearch = new CarSearch(carRepository);
        System.out.println(carSearch.findByCriteria(new ByNameCarCriteria("Fiat Punto")));
        System.out.println(carSearch.findByCriteria(c -> c.getPrice() <= 1500));
        //System.out.println(carSearch.findByCriteria((new ByNameCarCriteria("Fiat Punto")).and(car -> {return car.getPrice() <= 1500;})));
    }
}

package com.chrosciu.ocp;

public class Main {
    public static void main(String[] args) {
        CarRepository carRepository = new InMemoryCarRepository();
        CarSearch carSearch = new CarSearch(carRepository);
        System.out.println(carSearch.findByCriteria(car -> car.getName().equals("Fiat Punto")));
        System.out.println(carSearch.findByCriteria(car -> car.getPrice() <= 1500));
        System.out.println(carSearch.findByCriteria(car -> Color.WHITE.equals(car.getColor())));
    }
}

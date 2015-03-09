package com.lr.racing;

public class main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Lambo"), new Car("Ferrari"), new Car("Dewoo"), new Car("Atom"), new Car("Mazda")};
        Race myRace = new Race(600, cars);
        myRace.start();
    }
}

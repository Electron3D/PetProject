package com.repository.RandomChooserWhoDriveToLunch.entities;

public class Person {
    private String name;
    private int droveCount = 0;
    private int losesCounter = 0;
    private Car car;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int droveCount, Car car) {
        this.name = name;
        this.droveCount = droveCount;
        this.car = car;
    }

    public int getLosesCounter() {
        return losesCounter;
    }

    public void setLosesCounter(int losesCounter) {
        this.losesCounter = losesCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDroveCount() {
        return droveCount;
    }

    public void setDroveCount(int droveCount) {
        this.droveCount = droveCount;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    class Car {
        private String Model;

        public Car(String model) {
            Model = model;
        }

        public String getModel() {
            return Model;
        }

        public void setModel(String model) {
            Model = model;
        }
    }
}

package com.repository.RandomChooserWhoDriveToLunch.entities;

public class Place {
    private String name;
    private String address;
    private int numberOfVisits;
    private int winInRandomCounter;

    public Place(String name) {
        this.name = name;
    }

    public Place(String name, String address, int numberOfVisits) {
        this.name = name;
        this.address = address;
        this.numberOfVisits = numberOfVisits;
    }

    public int getWinInRandomCounter() {
        return winInRandomCounter;
    }

    public void setWinInRandomCounter(int winInRandomCounter) {
        this.winInRandomCounter = winInRandomCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    public void setNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits = numberOfVisits;
    }
}

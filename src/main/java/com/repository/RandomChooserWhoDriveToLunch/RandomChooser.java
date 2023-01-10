package com.repository.RandomChooserWhoDriveToLunch;

import com.repository.RandomChooserWhoDriveToLunch.entities.Person;
import com.repository.RandomChooserWhoDriveToLunch.entities.Place;

import java.util.*;

public class RandomChooser {
    private List<Person> listOfPersons = new ArrayList<>();
    private List<Place> listOfPlaces = new ArrayList<>();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто мы, братья? Введите имена через пробел");
        String persons = scanner.nextLine();
        System.out.println("Куда едем, братья? Введите места через пробел");
        String places = scanner.nextLine();
        init(persons, places);
        chooseWho();
        chooseWhere();
    }

    private void init(String persons, String places) {
        initializationOfPersons(persons);
        initializationOfPlaces(places);
    }

    private void initializationOfPersons(String persons) {
        List<String> personNamesList = Arrays.asList(persons.split(" "));
        personNamesList.forEach(x -> listOfPersons.add(new Person(x)));
    }

    private void initializationOfPlaces(String places) {
        List<String> personNamesList = Arrays.asList(places.split(" "));
        personNamesList.forEach(x -> listOfPlaces.add(new Place(x)));
    }

    public void chooseWho() {
        Person todayDriver;
        do {
            int numb = getRandomNumber(listOfPersons.size());
            todayDriver = listOfPersons.get(numb);
            todayDriver.setLosesCounter(todayDriver.getLosesCounter() + 1);
        } while (todayDriver.getLosesCounter() != 3);
        todayDriver.setDroveCount(todayDriver.getDroveCount() + 1);
        System.out.println("Сегодня едет: " + todayDriver.getName());
    }

    public void chooseWhere() {
        Place todayLunchPlace;
        do {
            int numb = getRandomNumber(listOfPlaces.size());
            todayLunchPlace = listOfPlaces.get(numb);
            todayLunchPlace.setWinInRandomCounter(todayLunchPlace.getWinInRandomCounter() + 1);
        } while (todayLunchPlace.getWinInRandomCounter() != 3);
        todayLunchPlace.setNumberOfVisits(todayLunchPlace.getNumberOfVisits() + 1);
        System.out.println("Сегодня едем в " + todayLunchPlace.getName());
    }

    private int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public List<Person> getListOfPersons() {
        return listOfPersons;
    }

    public List<Place> getListOfPlaces() {
        return listOfPlaces;
    }
}

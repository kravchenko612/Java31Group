package lesson24.HomeWork;

import java.util.Set;

public class MethodsDB {


    private DataBaseFine dataBaseFine;

    public MethodsDB() {
        dataBaseFine = new DataBaseFine();
        dataBaseFine.defaultDataBaseFine();//створюємо(заповнюємо БД)
    }

    public void printDataBase() {
        Set<Human> humans = dataBaseFine.getHumans();
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public void printByINN(int code) {
        if (code > 0) {
            Set<Human> humans = dataBaseFine.getHumans();
            for (Human human : humans) {
                if (human.getInn() == code) {
                    System.out.println(human);
                }
            }
        }

    }

    public void printUsersByFineType(String typeFine) {
        if (typeFine != null && !typeFine.isBlank()) {
            Set<Human> humans = dataBaseFine.getHumans();
            for (Human human : humans) {
                if (human.getFine().getFineMap().get(typeFine) != null && human.getFine().getFineMap().get(typeFine) > 0) {
                    System.out.println(human);
                }
            }
        }
    }

    public void printUsersByCity(String city) {
        if (city != null && !city.isBlank()) {
            Set<Human> humans = dataBaseFine.getHumans();
            for (Human human : humans) {
                if (human.getCity() != null && !human.getCity().isBlank() && human.getCity().equalsIgnoreCase(city)) {
                    System.out.println(human);
                }
            }
        }
    }


    public void addHuman(String name, int inn, String city) {
        Set<Human> humans = dataBaseFine.getHumans();
        humans.add(new Human(name, inn, city, new Fine()));
        System.out.println(humans);
    }

    public void addFine(String name, Fine fine) {
        Set<Human> humans = dataBaseFine.getHumans();
        for (Human human : humans) {
            if (human.getName().equals(name)) {
                human.setFine(fine);
                System.out.println(human);
            }
        }
    }

    public void removeFine(String name, String typeFine) {
        if (typeFine != null && !typeFine.isBlank()) {
            Set<Human> humans = dataBaseFine.getHumans();
            for (Human human : humans) {
                if (human.getName().equals(name) && human.getFine().getFineMap().get(typeFine) != null && human.getFine().getFineMap().get(typeFine) > 0) {
                    human.getFine().getFineMap().remove(typeFine);
                    System.out.println(human);
                }
            }
        }
    }

    public void replaceInfo(String name, int inn, String city, Fine fine) {
        Set<Human> humans = dataBaseFine.getHumans();
        for (Human human : humans) {
            if (human.getName().equals(name) && human.getInn() == inn && human.getCity().equals(city)) {
                human.setName(name);
                human.setInn(inn);
                human.setCity(city);
                human.setFine(fine);
                System.out.println(human);
            }
        }
    }

}

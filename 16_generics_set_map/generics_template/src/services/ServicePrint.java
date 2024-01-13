package services;

import java.util.ArrayList;
import java.util.List;

public class ServicePrint<T> {

    List<T> listOfObjects = new ArrayList<>();

    public void addValue(T value) {
        listOfObjects.add(value);
    }

    public T first() {
        if (listOfObjects.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return listOfObjects.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!listOfObjects.isEmpty()) {
            System.out.print(listOfObjects.get(0));
        }
        for (int i = 1; i < listOfObjects.size(); i++) {
            System.out.print(", " + listOfObjects.get(i));
        }
        System.out.println("]");
    }

}

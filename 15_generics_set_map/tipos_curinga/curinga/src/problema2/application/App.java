package problema2.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // COVARIÂNCIA

        /* É possível fazer um GET, impossível fazer um PUT(inserir) */
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        // list.add(20);

        // CONTRAVARIÂNCIA

        /* É possível fazer um PUT, impossível fazer um GET(obter) */
        List<Object> myObJects = new ArrayList<>();
        myObJects.add("Maria");
        myObJects.add("Alex");

        List<? super Number> myNums = myObJects;

        myNums.add(10);
        myNums.add(3.14);

        // Number x = myNums.get(0);

        // PROBLEMA 2

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        copy(myDoubles, myObjs);

    }

    // public static void copy(List<? extends Object> list, List<? extends Object>
    // list2) {
    // for (Object Item : list) {
    // list2.add(Item);
    // }
    // }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number n : source) {
            destiny.add(n);

        }
        printList(destiny);
        System.out.println("\n ------------------------------");
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj);
        }
    }
}

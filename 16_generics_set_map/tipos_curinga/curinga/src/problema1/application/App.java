package problema1.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import problema1.entities.Circle;
import problema1.entities.Rectangle;
import problema1.entities.Shape;

public class App {
    public static void main(String[] args) throws Exception {

        // Object obj;
        // Integer number = 100;

        // obj = number;

        // System.out.println(obj);

        // List<Object> listObject = new ArrayList<>();
        // List<Integer> listIntegers = new ArrayList<>();

        // for (int i = 0; i <= 100; i++) {
        // listIntegers.add(i);
        // }

        // // listObject = listIntegers;

        // List<?> listCuringa = new ArrayList<>();

        // listCuringa = listIntegers;
        // listCuringa = listObject;

        // boolean compare = listCuringa.equals(listObject) ? true : false;
        // System.out.println(compare);

        // List<Integer> myInts = Arrays.asList(5, 2, 10);
        // printList(myInts);

        // List<String> myStrings = Arrays.asList("Luiz", "Otávio", "Faria");
        // printList2(myStrings);

        // AULA 241

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("TOTAL AREA: " + totalArea(myShapes));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("TOTAL AREA: " + totalArea(myCircles));
    }

    // public static void printList(List<?> list) {
    // for (Object obj : list) {
    // System.out.println(obj);
    // }
    // System.out.println("Execução com CORINGA");
    // }

    // public static <T extends Object> void printList2(List<T> list) {
    // for (Object obj : list) {
    // System.out.println(obj);
    // }
    // System.out.println("Execução com PARAMETRIZAÇÃO");
    // }

    // AULA 241
    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}

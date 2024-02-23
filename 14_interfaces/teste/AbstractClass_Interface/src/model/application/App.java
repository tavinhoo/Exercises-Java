package model.application;

import model.entities.*;

public class App {
    public static void main(String[] args) throws Exception {

        AbstractShape s1 = new Circle(Color.black, 2.0);
        AbstractShape s2 = new Rectangle(Color.white, 3.0, 4.0);

        System.out.println("Circle color: " +  s1.getColor());
        System.out.println("Circle area:  " + String.format("%.2f", s1.area()));

        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area:  " + String.format("%.2f", s2.area()));



    }
}

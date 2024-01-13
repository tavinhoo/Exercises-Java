package model.application;

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConcreteScanner;
import model.entities.Device;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My letter");
        p.print("My letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        ComboDevice cd = new ComboDevice("2023");
        cd.processDoc("Luiz");
        cd.print("Otávio");
        System.out.println("ComboDevice scan result: " + cd.scan());

        }
    }

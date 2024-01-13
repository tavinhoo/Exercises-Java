package model.entities;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo Scan result";
    }

    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

}

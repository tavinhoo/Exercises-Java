package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Employee {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private Integer id;
    private String name;
    private Double salary;
    private LocalDateTime dateAndTime;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateAndTime = LocalDateTime.now();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Não consegui fazer desta forma.
    // public void addEmployee(List<Employee> anyList, Integer id, String name,
    // Double wage) {
    // anyList.add(new Employee(id, name, wage));
    // }

    public void setWage(Double salary) {
        this.salary = salary;
    }

    public LocalDateTime getDate() {
        return this.dateAndTime;
    }

    public void increaseSalary(double percentage) {
        this.setWage(salary + (salary * percentage / 100));
    }

    public void showAllEmployees(List<Employee> employeeList) {
        employeeList.forEach(employee -> {
            System.out.println(employee.getName());
        });
    }

    public String toString() {
        return "DATE: " + fmt1.format(this.dateAndTime) + "| ID: " + this.getId() + "| NAME: " + this.getName()
                + "| SALARY: "
                + this.getSalary();
    }

}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number of employees: ");
	int numOfEmployees = sc.nextInt();
	sc.nextLine();

	Employee[] listOfEmployee = new Employee[numOfEmployees];
	
	for(int i = 0; i<listOfEmployee.length; i++) {	
		System.out.printf("Employee #%d data: %n", i+1);
		System.out.println("Outsourced? (y/n)");
		char isOutSourced = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Hours: ");
		Integer hours = sc.nextInt();
		System.out.print("Value per hours: ");
		Double valuePerHours = sc.nextDouble();
		
		if(isOutSourced == 'y') {
				
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				sc.nextLine();
			
				Employee thisEmployee = new OutSourcedEmployee(name, hours, valuePerHours, additionalCharge);
				listOfEmployee[i] = thisEmployee;
				
				
			} else {	
				Employee thisEmployee = new Employee(name, hours, valuePerHours);
				listOfEmployee[i] = thisEmployee;
			}
		}
	
		for(Employee emp : listOfEmployee) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}	
	}
}

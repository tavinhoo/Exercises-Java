package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		
//		 DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner msc = new Scanner(System.in);
		
		
		System.out.print("Enter department's name: ");
		String departmentName = msc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = msc.nextLine();
		System.out.print("Level: ");
		String workerLevel = msc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = msc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = msc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Enter contract #%d data:", i);
			System.out.print("Date (DD/MM/YYY): ");
			String date = msc.next();
			LocalDate contractDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.println("Value per hour: ");
			double valuePerHour = msc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = msc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = msc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2)); 
		int year = Integer.parseInt(monthAndYear.substring(3)); 
		
		System.out.printf("Name: %s", worker.getName());
		System.out.printf("Department: %s", worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		
		msc.close();
	}
	}

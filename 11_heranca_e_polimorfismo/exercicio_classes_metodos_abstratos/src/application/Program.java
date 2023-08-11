package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax number: ");
		int taxNumber = sc.nextInt();
		sc.nextLine();
		
		List<Pessoa> listOfPessoas = new ArrayList<>();
		
		for(int i = 1; i<=taxNumber; i++) {
			System.out.println("Tax payer #" + i +  " data:");
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			switch (option) {
			case 'i': {
				System.out.print("Health expenditures: ");
				double anualExpeditures = sc.nextDouble();
				listOfPessoas.add(new PessoaFisica(name, anualIncome, anualExpeditures));
				break;
			} case 'c': {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				listOfPessoas.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
				break;
			}
			default:
				break;
			}
		}
		
		System.out.println("TAXES PAID: ");
		for(Pessoa pessoa : listOfPessoas) {
			System.out.println(pessoa.getNome() + " $ " + pessoa.impostoPago());
		}
		
		double totalTaxesPaid = 0;
		for(Pessoa pessoa : listOfPessoas) {
			totalTaxesPaid += pessoa.impostoPago();
		}
		
		
		System.out.print("TOTAL TAXES: " + String.format("%.2f", totalTaxesPaid));
	
		
		

	}

}

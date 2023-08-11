package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	// EXERCÍCIO 7
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int qtdNoVetor = mySc.nextInt();	
		
		double[] vetorNumerico = new double[qtdNoVetor];
		
		double media = 0;
		
		for(int i = 0; i<vetorNumerico.length;i++) {
			System.out.print("Digite um numero: ");
			double numero = mySc.nextDouble();
			vetorNumerico[i] = numero;
			media += numero;
		}
		
		media /= vetorNumerico.length;
		
		System.out.printf("MEDIA = %.2f%n", media);
		
		boolean temMenor = false;
		
		for(int k = 0; k<vetorNumerico.length; k++) {
			if(vetorNumerico[k] < media) {
				temMenor = true;
				break;
			}
		}
		
		if(temMenor) {
			System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
			for(int j = 0; j<vetorNumerico.length; j++) {
				if(vetorNumerico[j] < media) {
					System.out.println(vetorNumerico[j]);
				}
			}
		}



		// EXERCÍCIO 8

		System.out.println("Quantos numeros vai ter o vetor?");
		int nElemVetor = mySc.nextInt();

		int[] armazemDeNumeros = new int[nElemVetor];

		int soma = 0;
		boolean temPar = false;
		double mediaDosPares = 0;
		int qtdPares = 0;

		for(int i = 0; i<armazemDeNumeros.length; i++) {
			System.out.printf("[%d-%d]Digite um número: ", i + 1, armazemDeNumeros.length);
			int numero = mySc.nextInt();

			
				if(!(numero % 2 != 0)) {
					soma+= numero;
					qtdPares++;
					if(!temPar) {
						temPar = true;
					}
				}


			armazemDeNumeros[i] = numero;
		}


		if(temPar) {
			mediaDosPares = soma / qtdPares;
			System.out.printf("MEDIA DOS PARES = %.2f", mediaDosPares);
		} else {
			System.out.println("NENHUM NUMERO PAR...");
		}

		// EXERCÍCIO 9 "mais_belho"

		System.out.println("Quantas pessoas você vai digitar? ");
		int qtdPessoas = mySc.nextInt();
		mySc.nextLine();

		String[] nomes = new String[qtdPessoas];
		int[] idades = new int[qtdPessoas];

		String pessoaMaisVelha = " ";
		int maisVelho = 0;
		
		for(int i = 0; i<nomes.length; i++) {

			System.out.printf("Dados da %da pessoa: %n", i + 1);

			System.out.print("Nome: ");
			String nome = mySc.nextLine();
			System.out.print("Idade: ");
			int idade = mySc.nextInt();
			mySc.nextLine();

			if(idade>maisVelho) {
				maisVelho = idade;
				pessoaMaisVelha = nome;
			}

			nomes[i] = nome;
			idades[i] = idade;
 		}

		System.out.printf("Pessoa mais velha: %S", pessoaMaisVelha);

	}
}

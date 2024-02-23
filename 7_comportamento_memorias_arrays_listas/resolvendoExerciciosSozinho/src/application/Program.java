package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import util.DestrinchaVetor;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		// EXERCÍCIO 1
		System.out.println("Quantos numeros você vai digitar?");
		int n = mySc.nextInt();

		int[] vetorNumerico = new int[n];

		for (int i = 0; i < vetorNumerico.length; i++) {
			System.out.print("Digite um numero: ");
			vetorNumerico[i] = mySc.nextInt();
		}

		verificaNegativos(vetorNumerico);

		// EXERCÍCIO 2
		System.out.print("Quantos numeros voce vai digitar?");
		int qtdNumeros = mySc.nextInt();

		double[] vetorDosNumeros = new double[qtdNumeros];

		for (int i = 0; i < vetorDosNumeros.length; i++) {
			System.out.print("Digite um numero: ");
			double numero = mySc.nextDouble();
			vetorDosNumeros[i] = numero;
		}

		System.out.printf("VALORES = %s%n", DestrinchaVetor.printarValores(vetorDosNumeros));
		System.out.printf("SOMA = %.2f%n", DestrinchaVetor.soma(vetorDosNumeros));
		System.out.printf("MEDIA = %.2f%n", DestrinchaVetor.media(vetorDosNumeros));

		// EXERCÍCIO 3 "ALTURAS"

		System.out.println("Quantas pessoas serao digitas? ");

		int qtdPessoas = mySc.nextInt();

		Pessoa[] vetorSocial = new Pessoa[qtdPessoas];

		for (int i = 0; i < qtdPessoas; i++) {

			System.out.printf("Dados da %da pessoa: %n", i + 1);

			System.out.print("Nome: ");
			String nome = mySc.nextLine();

			mySc.nextLine();
			System.out.print("Idade: ");
			int idade = mySc.nextInt();

			System.out.print("Altura: ");
			double altura = mySc.nextDouble();

			Pessoa pessoa = new Pessoa(nome, idade, altura);

			vetorSocial[i] = pessoa;
		}

		System.out.printf("Altura média: %.2f%n", Pessoa.alturaMedia(vetorSocial));
		Pessoa.percentualMenorDeIdade(vetorSocial);

		// EXERCÍCIO 4
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int qtdDigitados = mySc.nextInt();
		
		int[] numerosDigitados = new int[qtdDigitados];
		int qtdPar = 0;
			
		for(int i = 1; i<=numerosDigitados.length; i++) {
			System.out.printf("Digite um numero [%d - %d]: ", i, qtdDigitados);
			int digitado = mySc.nextInt();

			if(digitado % 2 == 0) {
				qtdPar++;
			}

			numerosDigitados[i - 1] = digitado;
		}
		
		String numerosPares = " ";
		
		if(!(qtdPar == 0)) {
			for(int i = 0; i<numerosDigitados.length; i++) {
				if(numerosDigitados[i] % 2 == 0) {
					numerosPares += String.format("%s ", numerosDigitados[i]);
				}
			}
			System.out.printf("NUMEROS PARES: %n%s%n", numerosPares);
			System.out.printf("QUANTIDADE DE PARES = %d", qtdPar);
		}
		
		// EXERCÍCIO 5
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int qtdDigitos = mySc.nextInt();
		
		double[] numerosSalvos = new double[qtdDigitos];
		
		double maiorNumero = 0;
		int posicaoNumero = 0;
		
		for(int i = 0; i<numerosSalvos.length; i++) {
			System.out.print("Digite um numero: ");
			double numero = mySc.nextDouble();
			
			numerosSalvos[i] = numero;
			if(numerosSalvos[i] > maiorNumero) {
				maiorNumero = numerosSalvos[i];
				posicaoNumero = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.2f%n", maiorNumero);
		System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posicaoNumero);
		
		// EXERCÍCIO 6
		
		System.out.println("Quantos valores vai ter cada vetor?");
		int qtdCadaVetor = mySc.nextInt();
		
		int[] vetorA = new int[qtdCadaVetor];
		
		int[] vetorB = new int[qtdCadaVetor];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0; i <vetorA.length; i++) {
			int digitosA = mySc.nextInt();
			vetorA[i] = digitosA;
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0; i <vetorB.length; i++) {
			int digitosB = mySc.nextInt();
			vetorB[i] = digitosB;
		}
		
		System.out.println("Vetor Resultante: ");
		for(int j = 0; j<vetorA.length; j++) {
			System.out.println(vetorA[j] + vetorB[j]);
		}
		
		// EXERCÍCIO 7
		
		// System.out.println("Quantos elementos vai ter o vetor? ");
		// int qtdElementosVetor = mySc.nextInt();
		
		// double[] vetorDeMedia = new double[qtdElementosVetor];
		// double somaTotal = 0;
		
		// for(int i = 0; i<vetorDeMedia.length; i++) {
		// 		System.out.println("Digite um numero: ");
		// 		double nQualquer = mySc.nextDouble();
		// 		somaTotal += nQualquer;
		// }
		
		// double mediaAritmetica = somaTotal / vetorDeMedia.length;
		
		// System.out.printf("MEDIA DO VETOR = %.2f%n", mediaAritmetica);
		
		// boolean temMenor = false;
		
		// for(int i = 0; i<vetorDeMedia.length; i++) {
		// 	if(vetorDeMedia[i] < mediaAritmetica) {
		// 		temMenor = true;
		// 		break;
		// 	}
		// }

		// if(temMenor) {
		// 	System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		// 	for(double numero : vetorDeMedia)	 {
		// 		if(numero < mediaAritmetica) {
		// 			System.out.println(numero);
		// 		}
		// 		}
		// 	}	
		}

	// EXERCICIO 1 FUNÇÃO FEITA
	public static void verificaNegativos(int[] vetor) {
		boolean temNegativo = false;

		for (int j = 0; j < vetor.length; j++) {
			if (!(vetor[j] > 0)) {
				temNegativo = true;
				break;
			}
		}

		if (temNegativo) {
			System.out.println("NUMEROS NEGATIVOS: ");
			for (int k = 0; k < vetor.length; k++) {
				if (vetor[k] < 0) {
					System.out.println(vetor[k]);
				}
			}
		}
	}

}

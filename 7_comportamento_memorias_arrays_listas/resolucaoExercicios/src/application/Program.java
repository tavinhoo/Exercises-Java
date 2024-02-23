package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner mySc = new Scanner(System.in);

		// EXERCÍCIO 1
//		System.out.println("Quantos numeros você vai digitar? ");
//		int n = mySc.nextInt();
//
//		int[] arrayNumerico = new int[n];
//		for (int i = 0; i < arrayNumerico.length; i++) {
//			System.out.println("Digite um numero: ");
//			arrayNumerico[i] = mySc.nextInt();
//		}
//
//		System.out.println("NUMEROS NEGATIVOS: ");
//		for (int j = 0; j < arrayNumerico.length; j++) {
//			if (!(arrayNumerico[j] > 0)) {
//				System.out.println(arrayNumerico[j]);
//			}
//		}

		System.out.print("Quantos numeros voce vai digitar? ");
		int qtdNumeros = mySc.nextInt();

		int[] arrayNumerico = new int[qtdNumeros];

		for (int i = 0; i < arrayNumerico.length; i++) {
			System.out.println("Digite um numeri: ");
			arrayNumerico[i] = mySc.nextInt();
		}

		verificaNegativos(arrayNumerico);

		// EXERCÍCIO 2
		System.out.println("Quantos números você vai digitar?");
		int n = mySc.nextInt();

		double[] arrayComValores = new double[n];
		for (int i = 0; i < arrayComValores.length; i++) {
			System.out.println("Digite um numero: ");
			double num = mySc.nextDouble();
		}

		String valores = null;
		System.out.print("VALORES: ");
		for (int j = 0; j < arrayComValores.length; j++) {
			valores += String.valueOf(arrayComValores[j]);
		}
		System.out.println(valores);

	}

	// EXERCÍCIO 1 APRIMORADO
	public static void verificaNegativos(int[] vetor) {

		boolean temNegativo = false;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				temNegativo = true;
			}
		}

		if (temNegativo) {
			System.out.println("NUMEROS NEGATIVOS: ");
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j] < 0) {
					System.out.println(vetor[j]);
				}
			}
		} else {
			System.out.println("NÃO POSSUI NUMEROS NEGATIVOS... ");
		}

	}
}

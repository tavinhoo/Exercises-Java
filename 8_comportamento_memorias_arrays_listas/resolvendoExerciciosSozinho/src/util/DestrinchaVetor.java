package util;

// EXERCICIO 2 FUNCOES
public class DestrinchaVetor {

	public static String printarValores(double[] vetor) {
		String valuesOfVetor = "";
		for (int i = 0; i < vetor.length; i++) {
			valuesOfVetor += String.format("%.1f ", vetor[i]);
		}
		return valuesOfVetor;
	}

	public static double soma(double[] vetor) {
		double somatorio = 0;
		for (int k = 0; k < vetor.length; k++) {
			somatorio += vetor[k];
		}
		return somatorio;
	}

	public static double media(double[] vetor) {
		double media = 0;
		for (int j = 0; j < vetor.length; j++) {
			media += vetor[j];
		}

		return (double) media / vetor.length;
	}
}

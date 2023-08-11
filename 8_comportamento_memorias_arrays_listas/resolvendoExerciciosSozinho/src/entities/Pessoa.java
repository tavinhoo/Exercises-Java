package entities;

public class Pessoa {

	private String nome;
	private int idade;
	private double altura;

	public Pessoa() {

	}

	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public static double alturaMedia(Pessoa[] vetor) {
		double somaDasAlturas = 0;
		for (int s = 0; s < vetor.length; s++) {
			somaDasAlturas += vetor[s].getAltura();
		}

		return (double) somaDasAlturas / vetor.length;
	}

	public static void percentualMenorDeIdade(Pessoa[] vetor) {
		int qtdDeMenores = 0;
		double percentual = 0;
		String pessoasMenores = "";

		for (int i = 0; i < vetor.length; i++) {
			if (!(vetor[i].getIdade() > 16)) {
				qtdDeMenores++;
			} else {
				System.out.println("Nenhuma pessoa menor de idade...");
			}
		}

		if (!(qtdDeMenores == 0)) {
			percentual = (double) qtdDeMenores * 100 / vetor.length;
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[j].getIdade() < 16) {
					pessoasMenores += String.format("%s ", vetor[j].getNome());
				}
			}

			System.out.printf("Pessoas com menos de 16 anos: %.2f %%n", percentual);
			System.out.print(pessoasMenores);
		}

	}

//	public void setNome(String nome) {
//		this.nome = nome;
//	}

//
//	public void setIdade(int idade) {
//		this.idade = idade;
//	}

//	public void setAltura(double altura) {
//		this.altura = altura;
//	}
//	

}

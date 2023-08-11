package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda_anual, Integer numeroDeFuncionarios) {
		super(nome, renda_anual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	
	@Override
	public double impostoPago() {
		double impostoPago = 0;
		if(this.getNumeroDeFuncionarios() > 10) {
			impostoPago = this.getRenda_anual() * 0.14;
		} else {
			impostoPago = this.getRenda_anual() * 0.16;
		}
		return impostoPago;
	}
}

package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double renda_anual, Double gastosComSaude) {
		super(nome, renda_anual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public double impostoPago() {
		
		double impostoPago = 0;
		
		if(this.getRenda_anual() < 20000.00) {
			impostoPago = (this.getRenda_anual() * 0.15) - (this.getGastosComSaude() * 0.5); 
		} else {
			impostoPago = (this.getRenda_anual() * 0.25) - (this.getGastosComSaude() * 0.5);
		}
		
		return impostoPago;
	}
	
	
	
	
	
}

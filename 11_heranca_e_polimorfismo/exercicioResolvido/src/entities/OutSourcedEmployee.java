package entities;

public class OutSourcedEmployee extends Employee {

	private Double additionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}
	
	public OutSourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
//		return hours * valuePerHours + additionalCharge * 1.1; 
		return super.payment() + additionalCharge * 1.1;
	}
	
}

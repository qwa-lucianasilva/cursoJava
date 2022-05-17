package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
		
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	//Como a regra de pagamento para o funcion�rio terceirizado � diferente, teremos que sobrescrever esse m�todo de pagamento na classe de funcion�rio terceirizado
	
	@Override
	public double payment () {
		return super.payment() + additionalCharge * 1.1;
	}
}

package OPERACIONES;

public class SUMA {
	
	private double N1;
	private double N2;
	
	public SUMA(double N1, double N2) {
		this.N1= N1;
		this.N2 = N2;
	}
	
	public double calcularSuma() {
		return N1+N2;
	}

}

package com.curso.java.cursouno;

public class TRAPECIO {
	private double baseMenor;
	private double baseMayor;
	private double lado1t;
	private double lado2t;
	private double alturaT;
	
	
	public TRAPECIO(double baseMenor, double baseMayor, double altura, double lado1t, double lado2t) {
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.alturaT= altura;

}

	public double calcularArea() {
		return ((baseMenor + baseMayor)/2) * alturaT;
	}
	 public double calcularPerimetro() {
		 return lado1t+ lado2t+ baseMenor+ baseMayor;
	 }
}

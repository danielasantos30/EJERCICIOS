package com.curso.java.cursouno;

public class PENTAGONO {

	private double lado1P;
	private double apotema;
	
	
	public  PENTAGONO (double lado1P, double apotema) {
		this.lado1P =lado1P;
		this.apotema = apotema;
	}
		
		
	public double calcularArea() {
		return (5*lado1P *apotema)/2;	
	}
	
	public double calcularPerimetro() {
		return 5*lado1P;
	}
	
}

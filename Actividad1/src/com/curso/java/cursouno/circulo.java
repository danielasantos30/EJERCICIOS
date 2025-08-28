package com.curso.java.cursouno;


public class circulo {
	private double radio; 
	
	public circulo ( double radio) {
		this.radio = radio;
	}
	
	public double	calcularArea() {
		return 3.1416 *radio *radio;
	}
	
	public double calcularPerimetro() {
		return 2 * 3.1416 * radio;
	}
}

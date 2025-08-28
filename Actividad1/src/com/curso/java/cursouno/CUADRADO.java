package com.curso.java.cursouno;

public class CUADRADO {
	
	private double lado;
	
	public CUADRADO (double lado) {
		this.lado= lado;		
	}
	
	public double calcularArea () {
		return lado * lado;
	}

	public double calcularPerimetro() {
		return 4* lado; 
	}
}

package com.curso.java.cursouno;

public class ClaseTres implements Imprimir{

	String Lugar="México";
	
	// public void imprimirLugar() {
		// System.out.println("donde vivo es:  " + Lugar);
	//}
	@Override
	public String imprimir(String datos, int entero) {
		return (datos + " donde vivo es: " + Lugar + " desde hace: " + entero + " anios");
	}

}

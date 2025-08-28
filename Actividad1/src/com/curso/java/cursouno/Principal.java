package com.curso.java.cursouno;

public class Principal {

	public static void main(String[] args) {
	 // Objeto de ClaseUno
	ClaseUno objUno= new ClaseUno();
	
	 //objUno.imprimirNombre();
	System.out.println();
	System.out.println(objUno.imprimir("Usando herencia..",3));
	System.out.println("-----");
	
	 // Objeto de ClaseDos
	ClaseDos objDos = new ClaseDos();
	System.out.println();
	System.out.println(objDos.imprimir("Informacion de ClaseDos", 5));
	
	//Objeto de ClaseTres
	ClaseTres objTres = new ClaseTres();
	System.out.println();
	System.out.println(objTres.imprimir("El lugar", 10));

	}

}

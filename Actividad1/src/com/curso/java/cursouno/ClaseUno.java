/**
 * 
 */
package com.curso.java.cursouno;

/**
 * 
 */
public class ClaseUno implements Imprimir {
	private String nombre="Dani";
	String apellido="Santos";
	public int anioNacimiento= 2001;
	
	
	//public static void main (String args[]) {
		//System.out.print("hola mundo");
//	}

	public void imprimirNombre(){
		System.out.println("El nombre es:"+ nombre);
		System.out.println("El apellido es:"+ apellido);
		System.out.println("Edad:"+ (2025 - anioNacimiento));
	}


	@Override
	public String imprimir(String datos, int entero) {
		return (datos + "El nombre es:  " + nombre) + ("  El apellido es:  "+ apellido)+ ("  Edad:  "+ (2025 - anioNacimiento));
	
	}
}

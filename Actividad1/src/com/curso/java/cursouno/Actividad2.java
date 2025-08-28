package com.curso.java.cursouno;
import java.util.Scanner;

public class Actividad2 {
	
	
	public static void main(String[] args) {
		String nombre;
		int horas;
		int sueldo;
		int horastotales;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del trabajador");
		nombre = teclado.next();
		
		System.out.println("Ingrese el numero de horas trabajadas por dia");
		horas = teclado.nextInt();
		
		horastotales = horas * 10;
		sueldo = 15 * horastotales;
		
		
		
		System.out.println("El total de horas trabajadas en la quincena son:   " + horastotales);
		System.out.println("El sueldo quincenal es:   " + sueldo);
		System.out.println("El nombre del trabajador es:  " + nombre);
		
		
		
	}

}

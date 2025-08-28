package com.curso.java.cursouno;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		double numero1;
		double numero2;
		double suma;
		double resta;
		double mult;
		double div;
			
		System.out.println("Ingrese un numero");
		Scanner teclado = new Scanner(System.in);
		numero1 = teclado.nextInt();
		System.out.println("Ingrese otro numero");
		Scanner teclado2 = new Scanner(System.in);
		numero2 = teclado2.nextInt();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		mult = numero1 * numero2;
		div = numero1 / numero2;
		
		
		System.out.println("La suma de los dos numeros es:  " + suma );
		System.out.println("La resta de los dos numeros es:  " + resta );
		System.out.println("El producto de los dos numeros es:  " + mult );
		System.out.println("La divison de los dos numeros es:  " + div );
			
	
	}
	

}

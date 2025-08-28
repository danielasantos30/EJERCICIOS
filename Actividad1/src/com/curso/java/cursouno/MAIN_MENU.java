package com.curso.java.cursouno;
import java.util.Scanner;

public class MAIN_MENU {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String opcion;

	        do {
	            // Mostrar las opciones del menú
	            System.out.println("\n--- Calculadora de Figuras Geométricas ---");
	            System.out.println("CIRCULO");
	            System.out.println("TRIANGULO");
	            System.out.println("CUADRADO");
	            System.out.println("TRAPECIO");
	            System.out.println("PENTAGONO");
	            System.out.println("SALIR");
	            System.out.print("Elija una opción: ");
	            opcion = scanner.nextLine();

	            switch (opcion) {
	                case "CIRCULO":
	                    
	                    System.out.println("-- CIRCULO --");
	                    System.out.print("Ingrese el radio: ");
	                    double radio = scanner.nextDouble();
	                    circulo miCirculo = new circulo(radio);
	                    System.out.println("Área: " + miCirculo.calcularArea());
	                    System.out.println("Perímetro: " + miCirculo.calcularPerimetro());
	                    break;

	                case "TRIANGULO":
	                   
	                    System.out.println("-- TRIANGULO --");
	                    System.out.print("Ingrese la base: ");
	                    double base = scanner.nextDouble();
	                    System.out.print("Ingrese la altura: ");
	                    double altura = scanner.nextDouble();
	                    System.out.print("Ingrese el lado 1: ");
	                    double lado1 = scanner.nextDouble();
	                    System.out.print("Ingrese el lado 2: ");
	                    double lado2 = scanner.nextDouble();
	                    System.out.print("Ingrese el lado 3: ");
	                    double lado3 = scanner.nextDouble();
	                    TRIANGULO miTriangulo = new TRIANGULO(base, altura, lado1, lado2, lado3);
	                    System.out.println("Área: " + miTriangulo.calcularArea());
	                    System.out.println("Perímetro: " + miTriangulo.calcularPerimetro());
	                    break;
	                    
	                    
	                case "CUADRADO":
	                	System.out.println("--CUADRADO--");
	                	System.out.println("Ingrese el lado");
	                	double lado= scanner.nextDouble();
	                	CUADRADO miCuadrado = new CUADRADO(lado);
	                	System.out.println("Área: " + miCuadrado.calcularArea());
	                	System.out.println("Perímetro: " + miCuadrado.calcularPerimetro());
	                	break;
	                
	                case "TRAPECIO":
	                	System.out.println("--TRAPECIO--");
	                	System.out.println("Ingrese la base mayor");
	                	double baseMayor= scanner.nextDouble();
	                	System.out.println("Ingrese la base menor");
	                	double baseMenor= scanner.nextDouble();
	                	System.out.println("Ingrese el lado 1");
	                	double lado1t= scanner.nextDouble();
	                	System.out.println("Ingrese el lado 2");
	                	double lado2t= scanner.nextDouble();
	                	System.out.println("Ingrese la altura");
	                	double alturaT= scanner.nextDouble();
	                	TRAPECIO miTrapecio = new TRAPECIO(baseMenor, baseMayor, lado1t, lado2t, alturaT);
	                	System.out.println("Área: " + miTrapecio.calcularArea());
	                	System.out.println("Perímetro: " + miTrapecio.calcularPerimetro());
	                	break;
	                	
	                case "PENTAGONO":
	                	System.out.println("--PENTAGONO--");
	                	System.out.println("Ingrese el lado");
	                	double lado1P = scanner.nextDouble();
	                	System.out.println("Ingrese el apotema");
	                	double apotema = scanner.nextDouble();
	                	PENTAGONO miPentagono = new PENTAGONO(lado1P, apotema);
	                	System.out.println("Área: " + miPentagono.calcularArea());
	                	System.out.println("Perímetro: " + miPentagono.calcularPerimetro());
	                
	              
	                	
	                case "salir":
	                    System.out.println("\nSaliendo del programa...");
	                    break;
	                    
	                default:
	                    System.out.println("\nOpción no válida. Intente de nuevo.");
	            }
	            
	        } while (!opcion.equalsIgnoreCase("salir"));

	        scanner.close();
	    }
	}



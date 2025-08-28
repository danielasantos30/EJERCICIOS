package com.curso.java.cursouno;

public class Actividad3 {
	// realizar el cálculo de área y perímetro de las siguientes figuras geométricas: círculo, triángulo, cuadrado, trapecio y pentagono
	
	public static void main(String[] args) {
		double radioCirc= 5.0;
		double ladoCuad = 10.0;
		double basetrian = 5.0;
		double alturatrian = 10.0;
		double lado1trian =5.0;
		double lado2trian = 3.0;
		double lado3trian = 4.0;
		double basemayorTrap= 10.0;
		double baseMenorTrap= 8.0;
		double alturaTrap = 4.0;
		double lado1Trap = 9.0;
		double lado2Trap = 8.0;
		double lado1Pent = 15.0;
		double apotemaPent = 13.0;
		
		// --- Círculo ---
        System.out.println("Círculo" );
        System.out.println("Área: " + calculoAreaCirculo(radioCirc));
        System.out.println("Perímetro: " + calculoPerimetroCirculo(radioCirc));
		
        // Cuadrado
        System.out.println("\nCuadrado" );
        System.out.println("El area es " + calculoAreaCuadrado (ladoCuad));
        System.out.println("El perimetro es " + calculoPerimetroCuadrado(ladoCuad));
        
        // Triangulo
        System.out.println("\nTriangulo ");
		System.out.println("El area del rectangulo es: " + calculoAreaTriangulo(basetrian, alturatrian));
		System.out.println("El perimetro del triangulo es: " + calculoPerimetroTriangulo(lado1trian, lado2trian, lado3trian));
		
		//Trapecio
		System.out.println("\nTrapecio");
		System.out.println("El area del trapecio es: " + calculoAreaTrapecio(basemayorTrap, baseMenorTrap, alturaTrap));
		System.out.println("El perimetro del trapecio es: " + calculoPerimetroTrapecio (basemayorTrap,  baseMenorTrap,lado1Trap, lado2Trap));
	
		//Pentagono
		System.out.println("\nPentagono");
		System.out.println("El area del pentagono es: " + calculoAreaPentagono (apotemaPent, lado1Pent));
		System.out.println("El perimetro del pentagono es: " + calculoPerimetroPentagono (lado1Pent));
	}
	
		// METODOS
			//CIRCULO
		public static double calculoAreaCirculo ( double radio) {
			return 3.1416 * radio * radio;
		}
		public static double calculoPerimetroCirculo (double radio) {
			return 2* 3.1416 *radio;
		}
			//CUADRADO 
		public static double calculoAreaCuadrado (double lado) {
			return lado * lado;	
		}
		public static double calculoPerimetroCuadrado (double lado) {
			return 4* lado;
		}
			//TRIANGULO
		public static double calculoAreaTriangulo (double base, double altura) {
			return  (base * altura)/2 ;
		}
		public static double calculoPerimetroTriangulo (double lado1, double lado2, double lado3) {
			return lado1 + lado2 + lado3;
		}
		
			//TRAPECIO
		public static double calculoAreaTrapecio (double basemayor, double basemenor, double alturaTrap) {
			return ((basemayor + basemenor)/2 ) * alturaTrap;
		}
		
		public static double calculoPerimetroTrapecio (double basemayor, double basemenor, double lado1T, double lado2T) {
			return basemayor + basemenor + lado1T + lado2T;
		}
		
		//PENTAGONO
		public static double calculoAreaPentagono (double apotema, double ladopent) {
			return (5* ladopent * apotema)/2;
		}
		
		public static double calculoPerimetroPentagono (double ladopent) {
			return 5*ladopent;
		}
	

}

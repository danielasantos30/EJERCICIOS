package OPERACIONES;
import java.util.Scanner;

public class MAIN {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        
        do {
        	System.out.println("---CALCULADORA---");
        	System.out.println("SUMA");
        	System.out.println("RESTA");
        	System.out.println("MULTIPLICACION");
        	System.out.println("DIVISION");
        	System.out.println("SALIR");
        	System.out.println("Elija una opcion");
        	opcion=scanner.nextLine();
        	
        	switch(opcion) {
        	case "SUMA":
        		
        	System.out.println("--SUMA--");
        	System.out.println("Ingrese el primer numero");
        	double N1 = scanner.nextDouble();
        	System.out.println("Ingrese el segundo numero");
        	double N2 = scanner.nextDouble ();
        	SUMA miSuma= new SUMA (N1, N2);
        	System.out.println("SUMA: " + miSuma.calcularSuma());    
       break;
        	
        	case "RESTA":
        		System.out.println("--RESTA--");
            	System.out.println("Ingrese el primer numero");
            	double N11 = scanner.nextDouble();
            	System.out.println("Ingrese el segundo numero");
            	double N22 = scanner.nextDouble ();
            	RESTA miResta= new RESTA (N11, N22);
            	System.out.println("SUMA: " + miResta.calcularResta());  
        	break;
        	
        	case "MULTIPLICACION":
        		System.out.println("---MULTIPLICACION--");
        	System.out.println("Ingrese el primer numero");
        	double N111 = scanner.nextDouble();
        	System.out.println("Ingrese el segundo numero");
        	double N222 = scanner.nextDouble();
        	MULTIPLICACION miMultiplicacion = new MULTIPLICACION(N111, N222);
        	System.out.println("MULTIPLICACION:  " + miMultiplicacion.calcularMultiplicacion());
        	break;
            
        	case "DIVISION":
        		System.out.println("--DIVISION--");
        		System.out.println("Ingrese el primer numero");
        		double N1111 = scanner.nextDouble();
        		System.out.println("Ingrese el segundo numero");
        		double N2222 = scanner.nextDouble();
        		DIVISION miDivision = new DIVISION(N1111, N2222);
        		System.out.println("DIVISION:  "+ miDivision.calcularDivision());
        		break;
        	
        	}
        	
        	
        
        	
        }while (!opcion.equalsIgnoreCase("SALIR"));
        scanner.close();
	
	

}
}

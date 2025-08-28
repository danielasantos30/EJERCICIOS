package com.curso.java.cursouno;

public class ClaseDos implements Imprimir{

private String mensajePersonalizado="HOLA";

	public String imprimir(String datos, int entero) {
		// TODO Auto-generated method stub
		String resultado= "Clase2:" + datos + ". Mensaje personalizado.  " +    mensajePersonalizado + "  Valor del número:" + entero;
		return resultado;
	}

}

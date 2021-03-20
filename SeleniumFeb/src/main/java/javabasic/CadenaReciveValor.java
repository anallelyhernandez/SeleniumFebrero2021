package javabasic;

import java.util.Scanner;

public class CadenaReciveValor {

	public static void main(String[] args) {
		// Scanner para leer palabras
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe la primera cadena");
		String cadena= leer.next();
		
		System.out.println("Ingresa la segunda cadena");
		String cadena2=leer.next();
				
		if(cadena.equals(cadena2)) {
			System.out.println("Es Igual");
		}
		else {
			System.out.println("Es diferente");
			}
		if(cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("Es igual");
			
		}else {
			System.out.println("Son diferentes");
		}
		
		String texto ="Hola Mundo"; 
		String cadenaSinEspacio=texto.replace(" ", "");
		System.out.println(cadenaSinEspacio);
		
		System.out.println("Longitud: "+ texto.length());
	}

}

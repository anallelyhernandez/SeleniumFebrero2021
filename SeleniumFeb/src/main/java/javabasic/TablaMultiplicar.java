package javabasic;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tabla = new Scanner(System.in);
		int tab1 = 0;
		int result = 0;
		int temp = 0;

		System.out.println("Ingresa el número que deseas multiplicar");

		temp = tabla.nextInt();

		while (temp < 0) {
			System.out.println("El numero que ingresaste es menor que cero");

		}

		for (int i = 0; i <= 10; i++) {
			result = i * temp;
			System.out.println(" " + temp + "*" + i + "=" + result);
		}
		tabla.close();

	}

}

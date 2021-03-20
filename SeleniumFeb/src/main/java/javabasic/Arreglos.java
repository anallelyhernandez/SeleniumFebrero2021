package javabasic;

import javax.swing.JOptionPane;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[5]; //Arreglo de 5 numeros

		llenarArreglo(numeros);
		mostrarArreglo(numeros);

	}

	public static void llenarArreglo(int arreglo[]) { //Nos ayuda a llenar un arreglo de numeros
		for (int i = 0; i < arreglo.length; i++) {
			String texto = JOptionPane.showInputDialog("Ingresa un número: ");
			arreglo[i] = Integer.parseInt(texto);

		}
	}

	public static void mostrarArreglo(int arreglo[]) {//Nos ayuda a llenar el arreglo de números
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("El indice [" + i + "]" + "Esta el valor de [" + arreglo[i] + "]");

		}

	}

}

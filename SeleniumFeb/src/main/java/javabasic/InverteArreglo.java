package javabasic;

public class InverteArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Dado un arreglo de 5 posiciones con los valores 1, 2, 3, 4, 5 guardar los
		 * valores en otro arreglo y mostrarlo invertido el orden
		 */

		int[] arreglo1 = { 1, 2, 3, 4, 5 };
		int[] arreglo2 = new int[arreglo1.length];

		for (int i = (arreglo1.length - 1), j = 0; i >= 0; i--, j++) {
			arreglo2[j] = arreglo1[i];
			System.out.println(arreglo2[j]);
			
		}
		/*Arreglo 2 indices
		 *arreglo sos indices 1= 4*/
	}

}

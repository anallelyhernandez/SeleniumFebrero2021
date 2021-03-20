package javabasic;

public class WhileNumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		while (num <= 100) {
			System.out.println(num);

			if (num == 34) {
				break;
			}
			num++;
		}

		for (int numero = 50; numero <= 100; numero++) {
			System.out.println(numero);
		}

	}

}

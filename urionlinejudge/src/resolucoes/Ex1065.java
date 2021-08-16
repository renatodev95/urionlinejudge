package resolucoes;

import java.util.Scanner;

public class Ex1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num;
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;

		for (int i = 0; i < 5; i++) {
			num = sc.nextDouble();
			if (num % 2 == 0) pares++;
			if (num % 2 != 0) impares++;
			if (num > 0) positivos++;
			if (num < 0) negativos++;
		}
		
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
		sc.close();
	}
}

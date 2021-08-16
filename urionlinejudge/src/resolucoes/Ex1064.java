package resolucoes;

import java.util.Scanner;

public class Ex1064 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num;
		int positivos = 0;
		double soma = 0;

		for (int i = 0; i < 6; i++) {
			num = sc.nextDouble();
			if (num > 0) {
				positivos++;
				soma += num;
			}
		}

		sc.close();

		double media = soma / positivos;

		System.out.println(positivos + " valores positivos");
		System.out.println(String.format("%.1f", media));
	}
}

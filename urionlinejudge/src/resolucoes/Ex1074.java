package resolucoes;

import java.util.Scanner;

public class Ex1074 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtd = sc.nextInt();
		int num = 0;

		for (int i = 0; i < qtd; i++) {
			num = sc.nextInt();

			if (num == 0) {
				System.out.println("NULL");
			} else if (num < 0 && num % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (num < 0 && num % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			} else if (num > 0 && num % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			} else if (num > 0 && num % 2 != 0) {
				System.out.println("ODD POSITIVE");
			}

		}

		sc.close();

	}
}

package resolucoes;

import java.util.Scanner;

public class Ex1071 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int menor = x < y ? x : y;
		int maior = x > y ? x : y;
		int soma = 0;

		for (int i = menor + 1; i < maior; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}

		System.out.println(soma);
		sc.close();

	}
}

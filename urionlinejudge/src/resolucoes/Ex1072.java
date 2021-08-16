package resolucoes;

import java.util.Scanner;

public class Ex1072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtd = sc.nextInt();
		int num = 0;
		int in = 0;
		int out = 0;

		for (int i = 0; i < qtd; i++) {
			num = sc.nextInt();
			if (num >= 10 && num <=20) {
				in++;
			} else {
				out++;
			}
		}

		sc.close();
		
		System.out.println(in + " in");
		System.out.println(out + " out");

	}
}

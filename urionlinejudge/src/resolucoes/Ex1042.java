package resolucoes;

import java.util.Scanner;

public class Ex1042 {
	/*
	 * Sort Simples
	 *
	 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os
	 * valores em ordem crescente, uma linha em branco e em seguida, os valores na
	 * sequência como foram lidos
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(b);
			}
		} else if (b < c) {
			System.out.println(b);
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
			} else {
				System.out.println(c);
				System.out.println(a);
			}
		} else {
			System.out.println(c);
			if (a < b) {
				System.out.println(a);
				System.out.println(b);
			} else {
				System.out.println(b);
				System.out.println(a);
			}
		}
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		sc.close();

	}
}

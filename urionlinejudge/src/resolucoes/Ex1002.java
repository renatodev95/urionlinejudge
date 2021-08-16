package resolucoes;

import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double PI = 3.14159;
		double A = PI * Math.pow(raio, 2);

		System.out.printf("A = %.4f", A);

		sc.close();
	}
}

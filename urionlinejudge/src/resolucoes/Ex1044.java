package resolucoes;

import java.util.Scanner;

public class Ex1044 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		if ((A % B == 0) | (B % A == 0)) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o sao Multiplos");
		}

		sc.close();
	}
}

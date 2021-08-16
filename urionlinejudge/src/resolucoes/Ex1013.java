package resolucoes;

import java.util.Scanner;

public class Ex1013 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int maiorTemp = (a + b + Math.abs(a - b)) / 2;
		int maiorFinal = maiorTemp > c ? maiorTemp : c;

		System.out.println(maiorFinal + " eh o maior");

		scan.close();
	}
}

package resolucoes;

import java.util.Scanner;

public class Ex1018 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N, quociente, resto, nota;

		N = scan.nextInt();
		System.out.println(N);

		resto = N;

		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto %= nota;

		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto %= nota;

		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto %= nota;

		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto %= nota;

		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto %= nota;

		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto %= nota;

		nota = 1;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");

		scan.close();
	}
}

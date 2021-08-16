package resolucoes;

import java.util.Scanner;

public class Ex1020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dias = sc.nextInt();

		int resto = dias;

		int ano = 365;
		int quociente = resto / ano;
		resto %= ano;
		System.out.println(quociente + " ano(s)");

		int mes = 30;
		quociente = resto / mes;
		resto %= mes;
		System.out.println(quociente + " mes(s)");

		int dia = resto;
		System.out.println(dia + " dia(s)");

		sc.close();

	}
}

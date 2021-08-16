package resolucoes;

import java.util.Scanner;

public class Ex1019 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado
		 * evento em uma fábrica, e informe-o expresso no formato
		 * horas:minutos:segundos.
		 */

		Scanner scan = new Scanner(System.in);
		
		int N, resto, horas, minutos, segundos;

		N = scan.nextInt();
		
		horas = N / 3600;
		resto = N % 3600;
		
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

		scan.close();
	}
}

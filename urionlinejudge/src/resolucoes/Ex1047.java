package resolucoes;

import java.util.Scanner;

public class Ex1047 {

	// Tempo de Jogo com Minutos

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tempo, segundosInicio, segundosFim, hr, min;

		int horaInicio = sc.nextInt();
		int minutoInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int minutoFim = sc.nextInt();

		if (horaFim <= horaInicio && minutoFim <= minutoInicio) {
			horaFim += 24;
		} else if (minutoFim <= minutoInicio) {
			minutoFim += 60;
			horaFim -= 1;
		}

		segundosInicio = (horaInicio * 3600) + (minutoInicio * 60);
		segundosFim = (horaFim * 3600) + (minutoFim * 60);

		tempo = segundosFim - segundosInicio;
		hr = tempo / 3600;
		min = (tempo - (hr * 3600)) / 60;

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hr, min);

		sc.close();

	}
}

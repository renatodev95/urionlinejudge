package resolucoes;

import java.util.Scanner;

public class Ex1046 {

	// Tempo de Jogo

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		int deltaHora;

		if (horaInicio == horaFim) {
			deltaHora = 24;
		} else if (horaInicio > horaFim) {
			deltaHora = Math.abs(horaInicio - 24 - horaFim);
		} else {
			deltaHora = horaFim - horaInicio;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)", deltaHora);
		
		sc.close();
	}
}

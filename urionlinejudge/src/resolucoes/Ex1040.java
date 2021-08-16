package resolucoes;

import java.util.Scanner;

public class Ex1040 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float N1, N2, N3, N4, media, notaExame = 0, mediaExame = 0;
		String status1 = "";
		String status2 = "";

		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();

		media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;

		if (media >= 7.0) {
			status1 = "Aluno aprovado.";
		} else if (media < 5.0) {
			status1 = "Aluno reprovado.";
		} else if (media >= 5.0 && media <= 6.9) {
			status1 = "Aluno em exame.";
			notaExame = sc.nextFloat();
			mediaExame = (media + notaExame) / 2;
			if (mediaExame >= 5.0) {
				status2 = "Aluno aprovado.";
			} else {
				status2 = "Aluno reprovado.";
			}
		}
		
		System.out.printf("Media: %.1f\n", media);
		System.out.println(status1);
		if (media >= 5.0 && media <= 6.9) {
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			System.out.println(status2);
			System.out.printf("Media final: %.1f", mediaExame);
		}

		sc.close();

	}
}

package resolucoes;

import java.util.Scanner;

public class Ex1037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();
		String intervalo = "";
		
		if (valor >= 0 && valor <= 25.00) {
			intervalo = "[0,25]";
			System.out.println("Intervalo " + intervalo);
		} else if (valor >= 25.01 && valor <= 50.00) {
			intervalo = "Intervalo (25,50]";
			System.out.println("Intervalo " + intervalo);
		} else if (valor >= 50.01 && valor <= 75.00) {
			intervalo = "Intervalo (50,75]";
			System.out.println("Intervalo " + intervalo);
		} else if (valor >= 75.01 && valor <= 100.00) {
			intervalo = "Intervalo (75,100]";
			System.out.println("Intervalo " + intervalo);
		} else {
			System.out.println("Fora de intervalo");
		}
		
		

		sc.close();

	}
}

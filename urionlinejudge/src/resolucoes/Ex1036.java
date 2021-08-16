package resolucoes;

import java.util.Scanner;

public class Ex1036 {

	public static void main(String[] args) {

		// delta = b² - 4ac
		// x = -b += Vdelta / 2.a

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0 || 2 * a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.printf("R1 = %.5f\n", x1);
			System.out.printf("R2 = %.5f\n", x2);
		}

		sc.close();

	}
}

package resolucoes;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		for (int i = 1; i <= cases; i++) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			double m = ((v1 * 2) + (v2 * 3) + (v3 * 5)) / 10;
			System.out.printf("%.1f\n", m);
		}
		
		sc.close();

	}
}

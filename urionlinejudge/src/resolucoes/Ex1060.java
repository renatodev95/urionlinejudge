package resolucoes;

import java.util.Scanner;

public class Ex1060 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num;
		int positivos = 0;

		for (int i = 0; i < 6; i++) {
			num = sc.nextDouble();
			if (num > 0) {
				positivos+=1;
			}
		}
		
		System.out.println(positivos + " valores positivos");
		sc.close();
	}
}

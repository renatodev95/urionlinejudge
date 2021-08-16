package resolucoes;

import java.util.Scanner;

public class Ex1015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double deltaX = Math.pow((x2 - x1), 2);
		double deltaY = Math.pow((y2 - y1), 2);
		double distancia = Math.sqrt(deltaX + deltaY);
		
		System.out.printf("%.4f", distancia);

		sc.close();

	}
}

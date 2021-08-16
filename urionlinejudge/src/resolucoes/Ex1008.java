package resolucoes;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int workedHours = scan.nextInt();
		double hourPrice = scan.nextDouble();
		double salary = workedHours * hourPrice;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		scan.close();
	}
}

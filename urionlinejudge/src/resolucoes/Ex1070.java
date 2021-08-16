package resolucoes;

import java.util.Scanner;

public class Ex1070 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int impares = 1;
		sc.close();

		while (impares <= 6) {
			
			if (num % 2 != 0) {
				System.out.println(num);
				impares++;
			}
			
			num++;
		}

	}
}

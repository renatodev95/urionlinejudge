package resolucoes;

import java.util.Scanner;

public class Ex1080 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int maior = 0;
		int pos = 0;
		int c = 1;
		
		while (c <= 5) {
			num = sc.nextInt();
			
			if (num > maior) {
				maior = num;
				pos = c;
			}
			
			c++;
			
		}
		
		System.out.println(maior);
		System.out.println(pos);

		sc.close();

	}
}

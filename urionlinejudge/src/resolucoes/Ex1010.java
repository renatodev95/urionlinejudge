package resolucoes;

import java.util.Scanner;

public class Ex1010 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		@SuppressWarnings("unused")
		int p1code, p1num, p2code, p2num;
		double p1preco, p2preco;
		
		p1code = scan.nextInt();
		p1num = scan.nextInt();
		p1preco = scan.nextDouble();
		p2code = scan.nextInt();
		p2num = scan.nextInt();
		p2preco = scan.nextDouble();
		double preco1 = p1num * p1preco;
		double preco2 = p2num * p2preco;
		double precoTotal = preco1 + preco2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", precoTotal);
		
		scan.close();
	}
}

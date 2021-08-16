package resolucoes;

import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		String nomeFuncionario = scan.next();
		double salarioFixo = scan.nextDouble();
		double totalVendasNoMes = scan.nextDouble();
		double percentagemComissao = totalVendasNoMes * 0.15;
		double totalAReceber = salarioFixo + percentagemComissao;
		
		System.out.printf("TOTAL = R$ %.2f\n", totalAReceber);
		
		scan.close();
	}
}

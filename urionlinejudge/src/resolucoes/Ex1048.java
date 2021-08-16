package resolucoes;

import java.util.Scanner;

public class Ex1048 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double novoSalario = 0;
		double reajusteGanho = 0;
		double percentual = 0;
		
		if (salario >= 0 && salario <= 400.00) {
			percentual = 15;
		} else if (salario >= 400.01 && salario <= 800.00) {
			percentual = 12;
		} else if (salario >= 800.01 && salario <= 1200.00) {
			percentual = 10;
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			percentual = 7;
		} else {
			percentual = 4;
		}
		
		reajusteGanho = salario * (percentual/100);
		novoSalario = salario + reajusteGanho;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
		System.out.printf("Em percentual: %.0f %%\n", percentual);
		

		sc.close();

	}
}

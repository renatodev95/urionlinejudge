package resolucoes;

import java.util.Scanner;

public class Ex1017 {

	public static void main(String[] args) {
		 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner scan = new Scanner(System.in);
        
        int tempoGasto = scan.nextInt();
        int velocidadeMedia = scan.nextInt();
        double combustivelGasto = (double) tempoGasto * velocidadeMedia / 12;
        
        System.out.printf("%.3f%n", combustivelGasto);
        
        scan.close();
    }
}

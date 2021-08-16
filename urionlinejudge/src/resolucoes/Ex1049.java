package resolucoes;

import java.util.Scanner;

public class Ex1049 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palavra1 = sc.next();
		String palavra2 = sc.next();
		String palavra3 = sc.next();
		String animal = "";

		if (palavra1.equals("vertebrado")) {

			if (palavra2.equals("ave")) {

				if (palavra3.equals("carnivoro")) {
					animal = "aguia";
				} else if (palavra3.equals("onivoro")) {
					animal = "pomba";
				}

			} else if (palavra2.equals("mamifero")) {

				if (palavra3.equals("onivoro")) {
					animal = "homem";
				} else if (palavra3.equals("herbivoro")) {
					animal = "vaca";
				}

			}

		} else if (palavra1.equals("invertebrado")) {

			if (palavra2.equals("inseto")) {

				if (palavra3.equals("hematofago")) {
					animal = "pulga";
				} else if (palavra3.equals("herbivoro")) {
					animal = "lagarta";
				}

			} else if (palavra2.equals("anelideo")) {

				if (palavra3.equals("hematofago")) {
					animal = "sanguessuga";
				} else if (palavra3.equals("onivoro")) {
					animal = "minhoca";
				}

			}
			
		}

		System.out.println(animal);

		sc.close();

	}
}

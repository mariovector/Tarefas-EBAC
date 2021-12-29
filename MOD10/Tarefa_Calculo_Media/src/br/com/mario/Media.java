package br.com.mario;

import java.util.Scanner;


public class Media {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("digite a nota do primeiro bimestre: ");
		int nota1 = s.nextInt();
		
		System.out.println("digite a nota do segundo bimestre: ");
		int nota2 = s.nextInt();
		
		System.out.println("digite a nota do terceiro bimestre: ");
		int nota3 = s.nextInt();
		
		System.out.println("digite a nota do quarto bimestre: ");
		int nota4 = s.nextInt();

		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 0 && media <= 5) {

			System.out.println("Voce foi reprovado com média: " + media);
		} else if (media >= 5 && media <= 7) {

			System.out.println("Voce está em recuperação com média: " + media);

		} else {
			System.out.println("Parabéns! Voce foi aprovado com nota final " + media);

		}

	}
}

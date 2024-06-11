package br.com.M10Entrega;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		double verifica = 0;
		
		for (int i = 1; i<=4; i++) {
			System.out.println("Por gentileza, digite a nota da prova " + i +":");
			verifica = s.nextDouble();
			
			if (verifica <0 || verifica >10)
			{
				break;
			} else 
				{

				switch (i) {
					case 1: nota1 = verifica;
					break;
					case 2: nota2 = verifica;
					break;
					case 3: nota3 = verifica;
					break;
					default: nota4 = verifica;
						}
				}
			
		}
		
		if (verifica >=0 && verifica <=10) {
			media = (nota1+nota2+nota3+nota4)/4;
			System.out.println("A média final do(a) aluno(a) é: " + media);
			
			if (media >= 7) {
				System.out.println("Portanto, o(a) aluno(a) está aprovado!!");
			} else if (media >=5 && media <= 7) {
				System.out.println("O(a) aluno(a) precisa fazer recuperação!!");
			} else {
				System.out.println("Infelizmente, o(a) aluno(a) está Reprovado!!");
			}
		} else {
			System.out.println("A nota digitada está fora do intervalo permitido de 0 a 10, por favor refaça o processo.");
		}

		
		
	}

}

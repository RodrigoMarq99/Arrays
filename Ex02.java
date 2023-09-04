package ExerciciosArrays;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[10], indice, soma = 0;

		for(indice = 0; indice < vetor.length; indice++) {
			System.out.println("Digite o " + (indice+1) + "° número do vetor:");
			vetor[indice] = leia.nextInt();
		}
		System.out.println("Elementos nos índices ímpares: ");
		System.out.println(vetor[1] + " " + vetor[3] + " " + vetor[5] + " " + vetor[7] + " " + vetor[9]);
		System.out.println("Elementos pares: ");
		
		for(int acharPar = 0; acharPar < vetor.length; acharPar++) {
			if(vetor[acharPar] % 2 == 0) {
				System.out.print(vetor[acharPar] + " ");
			}
		}
		System.out.println("\nSoma: ");
		for (indice = 0; indice < vetor.length; indice++) {
			soma += vetor[indice];
		}
		System.out.println(soma);
		System.out.println("Média: ");
		System.out.println(soma / vetor.length);

		leia.close();
	}
}
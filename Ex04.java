package ExerciciosArrays;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float matriz[][] = new float[10][4];
		float vetorSoma[] = new float[10], soma = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {

				System.out.println("Digite a " + (coluna + 1) + "° nota do aluno " + (linha + 1) + ".");
				matriz[linha][coluna] = leia.nextFloat();
				soma += matriz[linha][coluna];
			}
			vetorSoma[linha] = soma;
			soma = 0;
		}
		for (int contador = 0; contador < vetorSoma.length; contador++)
			System.out.printf("\nMédia do aluno %d: %.1f", (contador+1), vetorSoma[contador]);
		leia.close();
	}
}

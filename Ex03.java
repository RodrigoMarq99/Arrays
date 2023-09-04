package ExerciciosArrays;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];

		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite o número que ficará na linha " + linha + " e coluna " + coluna + ".");
				matriz[linha][coluna] = leia.nextInt();	
		}
		}
		System.out.println("\nElementos da Diagonal Principal: ");
		System.out.println("\n" + matriz[0][0] + " " + " " + matriz[1][1] + " " + " " + matriz[2][2]);
		
		System.out.println("\nElementos da Diagonal Secundária: ");
		System.out.println("\n" + matriz[0][2] + " " + " " + matriz[1][1] + " " + " " + matriz[2][0]);
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: ");
		System.out.println("\n" + (matriz[0][0] + matriz[1][1] + matriz[2][2]));
		
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: ");
		System.out.println("\n" + (matriz[0][2] + matriz[1][1] + matriz[2][0]));
		
		leia.close();
	}
}

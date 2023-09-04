package ExerciciosArrays;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int posicao = -1; /* valor para verificação */
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int num = leia.nextInt();
		
		for(int indice = 0; indice < vetor.length; indice++) {
			if (num == vetor[indice]) {
				posicao = indice;
				break;
			}
			}
		if(posicao == -1){
			System.out.println("\nO número " + num + " não foi encontrado!");
		}else {
			System.out.println("\nO número " + num + " está localizado na posição " + (posicao+1) + ".");
		}
		leia.close();
	}
}
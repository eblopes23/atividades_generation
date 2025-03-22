package vetores_matrizes;

import java.util.Scanner;

public class Atividade1_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int numero_escolhido, posicao = -1, i = 0;
		int[] numeros = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.printf("Qual número está procurando?\n");
		numero_escolhido = ler.nextInt();
		
		for(i=0; i < numeros.length; i++) {
			
			if (numero_escolhido == numeros[i]) {
				posicao = i;
				System.out.printf("O número %d está na posição %d\n", numero_escolhido, posicao);
			}
		}
		
		if(posicao == -1) {
			System.out.printf("O número %d não está aqui\n", numero_escolhido);
		}
		
		ler.close();
	}

}

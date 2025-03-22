package vetores_matrizes;

import java.util.Scanner;

public class Atividade2_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int[] numero = new int[10];
		int soma=0;
		float media=0;
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %d º número\n", i+1);
			numero[i] = ler.nextInt();
			
			soma+= numero[i];
			media = (float) soma/(i+1);
		}
		
		System.out.printf("Os números que estão nos índices ímpares são:\n");
		
		for(int i = 0; i < 10; i++) {
			if (i%2 == 1) {
				System.out.printf("%d\n", numero[i]);
			}
		}
		
		System.out.printf("Os números pares são:\n");
		
		for(int i = 0; i < 10; i++) {
			if (numero[i] % 2 == 0) {
				System.out.printf("%d\n", numero[i]);
			}
		}
		
		System.out.printf("A soma de todos os números é: %d\n", soma);
		System.out.printf("A media de todos os números é: %.2f\n", media);
		
		ler.close();
	}

}

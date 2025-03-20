package lacos_repeticao;

import java.util.Scanner;

public class Atividade5_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int soma_positivo = 0, soma_negativo = 0;
		int i = 0;
		int[] numero = new int[50];
		
		do {
			System.out.printf("Digite um número:\n");
			numero[i]= ler.nextInt();
			
			
			if (numero[i] > 0) {
				
				soma_positivo+= numero[i];
				
			}else {
				
				soma_negativo+= numero[i];
			}
			
		}while (numero[i] != 0);
		
		System.out.printf("A soma dos números positivos é: %d\n", soma_positivo);
		System.out.printf("A soma dos números negativos é: %d\n", soma_negativo);
		
		ler.close();
	}

}

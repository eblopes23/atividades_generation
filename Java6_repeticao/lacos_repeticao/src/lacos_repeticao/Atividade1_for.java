package lacos_repeticao;

import java.util.Scanner;

public class Atividade1_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int numero1 = 0, numero2 = 0;
		
		System.out.printf("Digite o primeiro numero:\n");
		numero1 = ler.nextInt();
		System.out.printf("Digite o segundo numero maior do que o primeiro:\n");
		numero2 = ler.nextInt();
		
		if(numero1 > numero2) {
			System.out.printf("INTERVALO INCORRETO\n");
		} else {
			
			for(int multiplo = numero1; multiplo<= numero2; multiplo++) {
				
					if (multiplo % 3 == 0 && multiplo % 5 == 0) {
						System.out.printf("O número %d é multiplo de 3 e 5.\n", multiplo);
					}
			}
		}
		ler.close();
	}

}

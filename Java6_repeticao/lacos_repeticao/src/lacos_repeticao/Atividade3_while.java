package lacos_repeticao;

import java.util.Scanner;

public class Atividade3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0 , contador50= 0, contador21= 0;
		
		
		
		while (idade >= 0) {
				System.out.printf("Digite a idade:\n");
				idade = ler.nextInt();
				
			if (idade > 50) {
				contador50++;
			}
			else if (idade < 21 && idade >= 0) {
				contador21++;
			}
			
			//System.out.printf("Digite a idade:\n");
			//idade = ler.nextInt();
		}
		
		if (idade < 0) 
		{
			System.out.printf("Total de pessoas menores que 21 anos: %d\n", contador21);
			System.out.printf("Total de pessoas maiores de 50 anos: %d\n", contador50);
		}
		
		ler.close();
	}

}

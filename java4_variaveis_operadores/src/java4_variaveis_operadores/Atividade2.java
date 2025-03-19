package java4_variaveis_operadores;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		float resultado = 0, media = 0;
		float[] nota = new float [4];
		
		
		for(int i=0; i<4; i++) {
			System.out.printf("Digite a nota %d:\n", i+1);
			nota[i]= ler.nextFloat();
		
			resultado = (resultado + nota[i]);
			
			media = (resultado/(i+1));
		}
		
		
		/* tentei otimizar com o for, mas dessa forma também dá
		só precisaria voltar as variaveis para o float
		
		System.out.printf("Digite a nota 1:\n");
		nota1= ler.nextFloat(); 
		System.out.printf("Digite a nota 2:\n");
		nota2= ler.nextFloat(); 
		
		System.out.printf("Digite a nota 3:\n");
		nota3= ler.nextFloat(); 
		
		System.out.printf("Digite a nota 4:\n");
		nota4= ler.nextFloat(); 
		
		media = (nota1 + nota2 + nota3 + nota4)/4;*/
				
		System.out.printf("A média é: %.1f", media);
		
	}

}

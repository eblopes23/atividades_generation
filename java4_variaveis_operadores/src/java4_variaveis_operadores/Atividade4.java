package java4_variaveis_operadores;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		float calculo= 0;
		float[] numero = new float [4];
		
		
		for(int i=0; i<4; i++) {
			System.out.printf("Digite um número:\n");
			numero[i]= ler.nextFloat();
		}
		
		calculo = (numero[0]*numero[1]) - (numero[2]*numero[3]);
		System.out.printf("O resultado é: %.2f", calculo);
		
	}
}

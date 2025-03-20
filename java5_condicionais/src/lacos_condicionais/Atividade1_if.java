package lacos_condicionais;

import java.util.Scanner;

public class Atividade1_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int[] numero = new int [3];
		int resultado, i;
		
		System.out.printf("Digite 3 números:\n");
		
		for(i = 0; i <3; i++) {
			System.out.printf("número: \n");
			numero[i] = ler.nextInt();
		}
		
		resultado = numero[0] + numero [1];
		
		if(resultado > numero[2]) {
			System.out.printf("%d + %d = %d, logo %d é maior que %d\n", numero[0], numero[1], resultado, resultado, numero[2]);
		}
		else if (resultado < numero[2]) {
			System.out.printf("%d + %d = %d, logo %d é menor que %d\n", numero[0], numero[1], resultado, resultado, numero[2]);
		} else {
			System.out.printf("%d + %d = %d, logo %d é igual a %d\n", numero[0], numero[1], resultado, resultado, numero[2]);
		}
	}

}

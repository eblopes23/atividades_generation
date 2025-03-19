package java4_variaveis_operadores;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		float sal_bruto, noturno, horas_extras, descontos, sal_liquido; 
		
		System.out.printf("Digite o valor do salário bruto:\n");
		sal_bruto = ler.nextFloat(); 
		
		System.out.printf("Digite o valor do adicional noturno:\n");
		noturno = ler.nextFloat(); 
		
		System.out.printf("Digite o valor das horas extras:\n");
		horas_extras = ler.nextFloat(); 
		
		System.out.printf("Digite o valor dos descontos:\n");
		descontos = ler.nextFloat();
		
		sal_liquido = sal_bruto + noturno + (horas_extras*5) - descontos;
		
		System.out.printf("O salário líquido é de R$ %.2f\n", sal_liquido);
		
		
		
		
	}

}

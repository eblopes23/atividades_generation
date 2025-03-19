package java4_variaveis_operadores;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		float salario, abono, novo_salario;
		
		System.out.printf("Digite o salário:\n");
		salario = ler.nextFloat(); 
		
		System.out.printf("Digite o abono:\n");
		abono = ler.nextFloat(); 
		
		novo_salario = (salario + abono);
		
		System.out.printf("O novo salario é de R$ %.2f",novo_salario);
	}

}

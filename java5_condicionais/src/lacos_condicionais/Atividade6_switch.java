package lacos_condicionais;

import java.util.Scanner;

public class Atividade6_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		float salario, novo_salario;
		int codigo;
		
		Scanner ler = new Scanner (System.in);
		
		do {
			System.out.printf("Digite o nome do colaborador:\n");
			ler.skip("\\R?");
			nome = ler.nextLine();
			
			System.out.printf("Digite o salario do colaborador:\n");
			salario = ler.nextFloat();
			System.out.printf("-----------------------------------------------------\n");
			System.out.printf("Digite o numero do cargo do colaborador:\n");
			System.out.printf("1 - Gerente\n");
			System.out.printf("2 - Vendedor\n");
			System.out.printf("3 - Supervisor\n");
			System.out.printf("4 - Motorista\n");
			System.out.printf("5 - Estoquista\n");
			System.out.printf("6 - Técnico de TI\n");
			System.out.printf("7 - SAIR\n");
			System.out.printf("-----------------------------------------------------\n");
			codigo = ler.nextInt();
		
			switch(codigo) {
		
				case 1:
			
					novo_salario =  (salario + (salario * 0.15f));
				
					System.out.printf("************************************************\n");
					System.out.printf("Nome: %s\n", nome);
					System.out.printf("Cargo: Gerente\n");
					System.out.printf("Novo salário: R$ %.2f\n", novo_salario);
					System.out.printf("***********************************************\n");
					break;
			
				case 2:
				
					novo_salario =  (salario + (salario * 0.07f));
				
					System.out.printf("************************************************\n");
					System.out.printf("Nome: %s\n", nome);
					System.out.printf("Cargo: Vendedor\n");
					System.out.printf("Novo salário: R$ %.2f\n", novo_salario);
					System.out.printf("***********************************************\n");
					break;
				
				case 3:
				
					novo_salario =  (salario + (salario * 0.09f));
				
					System.out.printf("************************************************\n");
					System.out.printf("Nome: %s\n", nome);
					System.out.printf("Cargo: Supervisor\n");
					System.out.printf("Novo salário: R$ %.2f\n", novo_salario);
					System.out.printf("***********************************************\n");
					break;
				
				case 4:
				
					novo_salario =  (salario + (salario * 0.06f));
				
					System.out.printf("************************************************\n");
					System.out.printf("Nome: %s\n", nome);
					System.out.printf("Cargo: Motorista\n");
					System.out.printf("Novo salário: R$ %.2f\n", novo_salario);
					System.out.printf("***********************************************\n");
					break;
				
				case 5:
				
					novo_salario =  (salario + (salario * 0.05f));
				
					System.out.printf("************************************************\n");
					System.out.printf("Nome: %s\n", nome);
					System.out.printf("Cargo: Estoquista\n");
					System.out.printf("Novo salário: R$ %.2f\n", novo_salario);
					System.out.printf("***********************************************\n");
					break;
				
				case 6:
				
					novo_salario =  (salario + (salario * 0.08f));
				
					System.out.printf("************************************************\n");
					System.out.printf("Nome: %s\n", nome);
					System.out.printf("Cargo: Técnico de TI\n");
					System.out.printf("Novo salário: R$ %.2f\n", novo_salario);
					System.out.printf("***********************************************\n");
					break;
				
				default:
					while (codigo > 7 || codigo <= 0) {
						System.out.printf("*****************************************************\n");
						System.out.printf("* Código inválido, digite um número válido (1 a 6)! *\n");
						System.out.printf("*              Digite 7 se quiser SAIR              *\n");
						System.out.printf("*****************************************************\n");
						codigo = ler.nextInt();
					}
					break;
			}
		
		} while (codigo != 7);
			System.out.printf("PROGRAMA ENCERRADO");
		
		
	}

}

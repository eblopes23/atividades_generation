package lacos_condicionais;

import java.util.Scanner;

public class Atividade8_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float saldo = 1000f, deposito, saque;
		int operacao, resposta = 1;
		
		Scanner ler = new Scanner (System.in);
		
		do {
			System.out.printf("Qual operação deseja realizar?\n");
			System.out.printf("-----------------------------------------------------\n");
			System.out.printf("Digite o numero da operação a ser realizada:\n");
			System.out.printf("1 - Saldo\n");
			System.out.printf("2 - Saque\n");
			System.out.printf("3 - Depósito\n");
			System.out.printf("0 - SAIR\n");
			System.out.printf("-----------------------------------------------------\n");
			operacao = ler.nextInt();
			
			switch(operacao) {
			
			case 1:
			
				System.out.printf("************************************************\n");
				System.out.printf("Saldo atual %.2f\n", saldo);
				System.out.printf("***********************************************\n");
				break;
				
			case 2:
				
				System.out.printf("Quanto deseja sacar?\n");
				saque = ler.nextFloat();
				
				
				if(saque > saldo){
					System.out.printf("SALDO INSUFICIENTE!\n");
				}else {
					saldo = (saldo - saque);
					System.out.printf("SAQUE REALIZADO COM SUCESSO!\n");
					System.out.printf("Seu novo saldo é: R$ %.2f\n", saldo);
				}
				break;
				
			case 3:
				
				System.out.printf("Quanto deseja depositar?\n");
				deposito = ler.nextFloat();
				saldo = (saldo + deposito);
				System.out.printf("Seu novo saldo é: R$ %.2f\n", saldo);
				break;
				
			default:
				while (operacao > 3 || operacao < 0) {
					System.out.printf("*****************************************************\n");
					System.out.printf("* Código inválido, digite um número válido (1 a 3)! *\n");
					System.out.printf("*             Digite 0 se quiser SAIR               *\n");
					System.out.printf("*****************************************************\n");
					operacao = ler.nextInt();
				}
				break;
			}
			
			if(operacao != 0) {
				System.out.printf("Deseja realizar outra operação?\n");
				System.out.printf("0 = NÃO          1 = SIM\n");
				operacao = ler.nextInt();
			}else {
				operacao = 0;
			}
		} while( operacao != 0);
		
		System.out.printf("OPERAÇÃO ENCERRADA");
	}

}

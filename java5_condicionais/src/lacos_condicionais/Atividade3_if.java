package lacos_condicionais;

import java.util.Scanner;

public class Atividade3_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		int idade;
		String nome;
		boolean doacao;
		
		System.out.printf("Me informe seu nome:\n");
		nome = ler.nextLine();
		System.out.printf("Me informe sua idade:\n");
		idade = ler.nextInt();
		
		
		if(idade >= 18 && idade <= 59) {
			System.out.printf("%s pode doar sangue", nome);
		} 
		else if (idade >= 60 && idade <= 69) {
			System.out.printf("É a primeira vez que doa sangue?\n");
			System.out.printf("Digite TRUE se for a primeira vez e FALSE  se não for\n");
			doacao = ler.nextBoolean();
			if(doacao == true) {
				System.out.printf("%s não pode doar sangue", nome);
			} else {
				System.out.printf("%s pode doar sangue", nome);
			}
		} else {
			System.out.printf("%s não pode doar sangue", nome);
		}

	}
}

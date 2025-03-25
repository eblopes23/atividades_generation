package java9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2_pilha {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		Stack<String> pilha = new Stack<String>();
		
		
		do {
			System.out.printf("************************************\n");
			System.out.printf("Digite a opção desejada:\n");
			System.out.printf("\n1 - Adicionar livro à pilha\n");
			System.out.printf("2 - Listar os livros\n");
			System.out.printf("3 - Remover livro da pilha\n");
			System.out.printf("0 - SAIR\n");
			System.out.printf("************************************\n");
			
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.printf("Digite o nome do livro:\n");
				sc.skip("\\R?");
				pilha.push(sc.nextLine());
				System.out.println("Livro adicionado(a)!\n");
				System.out.println("A pilha agora é composta por:\n" + pilha);
				break;
				
			case 2:
				Iterator<String> iterator = pilha.iterator();
				
				while(iterator.hasNext()){
				   System.out.println(iterator.next());
				}
				break;
				
			case 3:
				
				if (pilha.isEmpty()== true) {
					System.out.printf("A pilha está vazia!\n");
				}else {
				System.out.println("O livro "+ pilha.pop() + " foi retirado\n");
				System.out.println("A pilha agora é composta por:\n" + pilha);
				}
				break;
				
			case 0:
				System.out.printf("PROGRAMA FINALIZADO!");
			}
			
		} while (opcao != 0);
		
		sc.close();

	}

}

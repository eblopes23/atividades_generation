package java9;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Atividade1_fila {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		Queue<String> fila = new LinkedList<String>();
		
		
		do {
			System.out.printf("************************************\n");
			System.out.printf("Digite a opção desejada:\n");
			System.out.printf("\n1 - Adicionar cliente à fila\n");
			System.out.printf("2 - Listar os clientes\n");
			System.out.printf("3 - Remover cliente da fila\n");
			System.out.printf("0 - SAIR\n");
			System.out.printf("************************************\n");
			
			opcao = sc.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.printf("Digite o nome do cliente:\n");
				fila.add(sc.next());
				//Collections.addAll(fila, "Elisa", "Lucas");
				System.out.println("Cliente adicionado(a)!\n");
				System.out.println("A fila agora é composta por:\n" + fila);
				break;
				
			case 2:
				Iterator<String> iterator = fila.iterator();
				
				while(iterator.hasNext()){
				   System.out.println(iterator.next());
				}
				break;
				
			case 3:
				
				if (fila.isEmpty()== true) {
					System.out.printf("A fila está vazia!\n");
				}else {
				System.out.println("Cliente "+fila.remove()+ " foi chamado(a)\n");
				System.out.println("A fila agora é composta por:\n" + fila);
				}
				break;
				
			case 0:
				System.out.printf("ATENDIMENTO FINALIZADO!");
			}
			
		} while (opcao != 0);
		
		sc.close();
	}

}

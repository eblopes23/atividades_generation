package java8_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite a cor %d: ", i+1);
			cores.add(sc.next());
		}
		
		System.out.printf("\nAs cores que você digitou são:\n");
		
		for(String cor: cores) {
			System.out.printf(" %s\n", cor);
		}
		
		System.out.printf("Lista ordenada das cores:\n");
		cores.sort(null);
		System.out.println(cores);
		
		sc.close();
	}

}

package java8_collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Atividade4_collectionset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		int numero;
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		System.out.printf("Qual numero você quer procurar?\n");
		numero = sc.nextInt();
		
		//boolean procurar = setNumeros.contains(numero);
	
		if(setNumeros.contains(numero) == true) {
			System.out.printf("O numero %d foi encontrado!", numero);
		}else {
			System.out.printf("O numero %d não foi encontrado!", numero);
		}
		
		sc.close();

	}

}

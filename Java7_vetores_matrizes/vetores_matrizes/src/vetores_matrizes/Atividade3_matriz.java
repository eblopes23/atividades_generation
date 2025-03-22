package vetores_matrizes;

import java.util.Scanner;

public class Atividade3_matriz {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int soma_principal=0, soma_secundaria=0;
		
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.printf("Digite o numero da linha %d coluna %d:\n", i+1, j+1);
				matriz[i][j] = ler.nextInt();
			}
		}
		System.out.printf("Os elementos da diagonal principal são:\n");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i==j) {
					soma_principal+= matriz[i][j];
					
					System.out.printf("%d\n", matriz[i][j]);
				}
			}
		}
		System.out.printf("A soma da diagonal principal é: %d\n", soma_principal);
		
		System.out.printf("--------------------------------------------------------\n");
		
		System.out.printf("Os elementos da diagonal secundária são:\n");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(i+j == 2) {
					soma_secundaria+= matriz[i][j];
					
					System.out.printf("%d\n", matriz[i][j]);
				}
			}
		}
		System.out.printf("A soma da diagonal secundária é: %d\n", soma_secundaria);
		
		ler.close();
	}

}

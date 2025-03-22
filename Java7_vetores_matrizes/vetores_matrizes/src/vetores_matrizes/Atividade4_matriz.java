package vetores_matrizes;

import java.util.Scanner;

public class Atividade4_matriz {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		float[][] matriz = new float[10][4];
		float[] media = new float[10];
		float soma;
		int i = 0, j = 0;
		
		for(i = 0; i<10; i++) {
			soma = 0f;
			System.out.printf("Notas do aluno %d\n", i+1);
			for(j = 0; j<4; j++) {
				System.out.printf("Digite a nota do %dº bimestre:\n", j+1);
				matriz[i][j] = ler.nextFloat();
				soma+= matriz[i][j];
			}
			media[i] = soma/j;
		}
		for( i=0; i<10; i++) {
			System.out.printf("A média do aluno %d é: %.1f\n", i+1, media[i]);
		}
		ler.close();
	}

}

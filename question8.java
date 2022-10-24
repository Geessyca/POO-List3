package list3;

import java.util.Scanner;

public class question8 {
	static int Diagonal(int[][] m1) {
		
		int soma=m1[0][1]+m1[0][2]+m1[1][2];
		
		return soma;
	}
	
	static int[] Vetor(int[][] m1) {
		
		int vet[] = {m1[0][0],m1[0][1],m1[0][2]};

		return vet;
	}
	
	static void Menu(int[][] m1) {
		Scanner readUser = new Scanner(System.in);
		int opcao;
		System.out.printf("Escolha uma opção\n"
				+ "1- Soma dos dos elementos que estão acima da diagonal principal\n"
				+ "2- Elementos da primeira linha da matriz\n"
				+ "3- Os dois metodos\n");
		opcao=readUser.nextInt();
		
		if (opcao==1) {System.out.printf("A soma dos dos elementos que estão acima da diagonal principal é: " + Diagonal(m1));}
		else if (opcao==2) {int vet[] = Vetor(m1);
				System.out.printf("Os elementos da primeira linha da matriz são: " + vet[0]+","+vet[1]+","+vet[2]);}
		else if (opcao==3) {int vet[] = Vetor(m1);
		System.out.printf("A soma dos dos elementos que estão acima da diagonal principal é: " + Diagonal(m1) +
				"\nOs elementos da primeira linha da matriz são: " + vet[0]+","+vet[1]+","+vet[2]);}
		else {System.out.printf("Opcao Invalida\n"); Menu(m1);}

	}
	
	public static void main(String args[]) {
		Scanner readUser = new Scanner(System.in);
		int[][] m1 = new int[4][3];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf("Elemento [" + i + "][" +j + "]: ");
				m1[i][j]=readUser.nextInt();
			}
		}
		Menu(m1);
		
		
	}
}
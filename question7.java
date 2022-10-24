package list3;

import java.util.Scanner;

public class question7 {
	static int Maior (int[][] m1) {
		
		int maior = m1[0][0];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				if(m1[i][j]>maior) {
					maior=m1[i][j];
				}
			}
		}

		return maior;
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
		
		System.out.printf("O maior valor é: " + Maior(m1));
	}
}
package list3;

import java.util.Scanner;

public class question5 {
	static void SomaMatriz (int[][] m1, int[][] m2) {
		
		int[][] soma = new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				soma[i][j]=m1[i][j]+m2[i][j];
			}
		}

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf(soma[i][j] + " ");
			}
			System.out.printf("\n");
		}
	}
	public static void main(String args[]) {
		Scanner readUser = new Scanner(System.in);
		int[][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2 = {{9,8,7},{6,5,4},{3,2,1}};
		SomaMatriz(m1,m2);
				
	}
}
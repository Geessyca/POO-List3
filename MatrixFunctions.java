package List3;
//question8
public class MatrixFunctions {
	static int Diagonal(int[][] matriz) {
		
		int sum=matriz[0][1]+matriz[0][2]+matriz[1][2];
		
		return sum;
	}
	
	static int[] Vector(int[][] matriz) {
		
		int vector[] = {matriz[0][0],matriz[0][1],matriz[0][2]};

		return vector;
	}
	
	static void Menu(int[][] matriz) {
		int option = GetUserUtils.getNumberInt("Escolha uma opção\n"
				+ "1- Soma dos dos elementos que estão acima da diagonal principal\n"
				+ "2- Elementos da primeira linha da matriz\n"
				+ "3- Os dois metodos\n");
		
		if (option==1) {System.out.printf("A sum dos dos elementos que estão acima da diagonal principal é: " + Diagonal(matriz));}
		else if (option==2) {int vector[] = Vector(matriz);
				System.out.printf("Os elementos da primeira linha da matriz são: " + vector[0]+","+vector[1]+","+vector[2]);}
		else if (option==3) {int vector[] = Vector(matriz);
		System.out.printf("A soma dos dos elementos que estão acima da diagonal principal é: " + Diagonal(matriz) +
				"\nOs elementos da primeira linha da matriz são: " + vector[0]+","+vector[1]+","+vector[2]);}
		else {System.out.printf("Opcao Invalida\n"); Menu(matriz);}

	}
	
	public static void main(String args[]) {
		int[][] matriz = new int[4][3];
		
		for(int line=0;line<4;line++) {
			for(int column=0;column<3;column++) {
				matriz[line][column]=GetUserUtils.getNumberInt("Elemento [" + line + "][" +column + "]: ");
			}
		}
		Menu(matriz);
		
		
	}
}
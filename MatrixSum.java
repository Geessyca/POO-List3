package List3;
//question5
public class MatrixSum {
	static void Sum (int[][] firstMatrix, int[][] secondMatrix) {
		
		int[][] matrixSummed = new int [3][3];
		
		for(int line=0;line<3;line++) {
			for(int column=0;column<3;column++) {
				matrixSummed[line][column]=firstMatrix[line][column]+secondMatrix[line][column];
			}
		}

		for(int line=0;line<3;line++) {
			for(int column=0;column<3;column++) {
				System.out.printf(matrixSummed[line][column] + " ");
			}
			System.out.printf("\n");
		}
	}
	public static void main(String args[]) {
		int[][] firstMatrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] secondMatrix = {{9,8,7},{6,5,4},{3,2,1}};
		Sum(firstMatrix,secondMatrix);
				
	}
}
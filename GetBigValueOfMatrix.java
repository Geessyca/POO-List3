package List3;
//question7
public class GetBigValueOfMatrix {
	static int GetBigValue (int[][] matrix) {
		
		int bigValue = matrix[0][0];
		
		for(int line=0;line<4;line++) {
			for(int column=0;column<3;column++) {
				if(matrix[line][column]>bigValue) {
					bigValue=matrix[line][column];
				}
			}
		}

		return bigValue;
	}
	public static void main(String args[]) {
		int[][] matrix = new int[4][3];
		
		for(int line=0;line<4;line++) {
			for(int column=0;column<3;column++) {
				matrix[line][column]=GetUserUtils.getNumberInt("Elemento [" + line + "][" +column + "]: ");
			}
		}
		
		System.out.printf("O maior valor é: " + GetBigValue(matrix));
	}
}
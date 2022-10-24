package list3;

import java.util.Scanner;

public class question2 {
	static double Hipotenusa(double b, double c) {
		return Math.sqrt((b*b+c*c));
	}

	public static void main(String args[]) {
	  Scanner readUser = new Scanner(System.in);
	  
	  double b, c;
	  System.out.printf("Informe o valor do cateto b: ");
	  b = readUser.nextDouble();
	  System.out.printf("Informe o valor do cateto c: ");
	  c = readUser.nextDouble();
	  
	  System.out.printf("A hipotenusa é: " + Hipotenusa(b,c));
	}
}
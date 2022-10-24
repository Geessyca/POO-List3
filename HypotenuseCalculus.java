package List3;
//question2
public class HypotenuseCalculus {
	static double Hypotenuse(double b, double c) {
		return Math.sqrt((b*b+c*c));
	}

	public static void main(String args[]) {
	double b = GetUserUtils.getNumberDouble("Informe o valor do cateto b: ");
	double c = GetUserUtils.getNumberDouble("Informe o valor do cateto c: ");
	  
	  System.out.printf("A hipotenusa é: " + Hypotenuse(b,c));
	}
}
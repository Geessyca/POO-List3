package List3;
//question6
import java.util.Random;

public class GuessNumber03 {
	public static void main(String args[]) {
	  Random randomNumber = new Random();

	  int vectorNumeric[] = new int[10];

	  for (int i=0;i<10;i++) {
		  vectorNumeric[i]=randomNumber.nextInt(100 + 1) + 1;
	  }
	  
	  int drawnNumber, validation=1;

	  drawnNumber = GetUserUtils.getNumberInt("\nDigite seu numero: ");
	  
	  for (int i=0;i<10;i++) {
		    if(drawnNumber==vectorNumeric[i]) {
		    	 System.out.printf("Você acertou!");
		    	 validation=0;
			}
		  }
	  
	  if(validation!=0){System.out.printf("Nenhum dos 10 numeros são iguais ao digitado por você :(");}
	  
	}
}
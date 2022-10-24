package List3;
//question3
import java.util.Random;

public class GuessNumber01 {
	public static void main(String args[]) {
	  Random random = new Random();

	  int randomNumber = random.nextInt(10 + 1) + 1;
	  
	  int drawnNumber = GetUserUtils.getNumberInt("Digite seu numero: ");
	  
	  if (drawnNumber == randomNumber) {
		 System.out.printf("\nVocê acertou!"); 
	  }
	  else {
		  System.out.printf("Você errou, o número era " + randomNumber);
	  }
	  
	}
}
package List3;
//question4
import java.util.Random;
import javax.swing.*;
public class GuessNumber02 {
	static int RandomNumber () {
		Random randomNumber = new Random();
		return randomNumber.nextInt(10 + 1) + 1;
	}
	static int TryValue (int randomNumber, int drawnNumber) {
		  if (drawnNumber == randomNumber) {
			 return 1;
		  }
		  else {
			  return 0;
		  }
	}
	public static void main(String args[]) {	  
	  int drawnNumber, returnNumber=0;
	  int randomNumber = RandomNumber();
	  
	  drawnNumber = GetUserUtils.getNumberInt("Digite seu numero: ");
	  returnNumber = TryValue(randomNumber,drawnNumber);
	  
	  while (returnNumber!=1) {
	    
	  returnNumber = TryValue(randomNumber,drawnNumber);
	  
	  Object[] options = { "Tentar novamente", "Sair" };
	  int option = JOptionPane.showOptionDialog(null, "Você errou!", "Tentar novamente", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
	  if(option == 0) {
		  System.out.printf("Digite seu numero: ");
		  drawnNumber = GetUserUtils.getNumberInt("Digite seu numero: ");
		  returnNumber = TryValue(randomNumber,drawnNumber);
	  }
	  else {
		  break;
	  }
	  }
	  if (returnNumber ==1) {
	  System.out.printf("\nVocê acertou!");}
	}
}
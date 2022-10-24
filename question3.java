package list3;

import java.util.Random;
import java.util.Scanner;

public class question3 {
	public static void main(String args[]) {
	  Scanner readUser = new Scanner(System.in);
	  
	  Random random = new Random();

	  int aleatorio = random.nextInt(10 + 1) + 1;
	  
	  int adv;
	  System.out.printf("Digite seu numero: ");
	  adv = readUser.nextInt();
	  
	  if (adv == aleatorio) {
		 System.out.printf("\nVocê acertou!"); 
	  }
	  else {
		  System.out.printf("Você errou, o número era " + aleatorio);
	  }
	  
	}
}
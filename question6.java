package list3;

import java.util.Random;
import java.util.Scanner;

public class question6 {
	public static void main(String args[]) {
	  Scanner readUser = new Scanner(System.in);
	  Random random = new Random();

	  int vetor[] = new int[10];

	  for (int i=0;i<10;i++) {
		  vetor[i]=random.nextInt(100 + 1) + 1;
	  }
	  
	  int alternativa, c=1;
	  
	  System.out.printf("\nDigite seu numero: ");
	  alternativa = readUser.nextInt();
	  
	  for (int i=0;i<10;i++) {
		    if(alternativa==vetor[i]) {
		    	 System.out.printf("Você acertou!");
		    	 c=0;
			}
		  }
	  
	  if(c!=0){System.out.printf("Nenhum dos 10 numeros são iguais ao digitado por você :(");}
	  
	}
}
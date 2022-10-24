package list3;

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
public class question4 {
	static int Numero () {
		Random random = new Random();
		int aleatorio = random.nextInt(10 + 1) + 1;
		return aleatorio;
	}
	static int Tentativa (int aleatorio, int adv) {
		  if (adv == aleatorio) {
			 return 1;
		  }
		  else {
			  return 0;
		  }
	}
	public static void main(String args[]) {

	  Scanner readUser = new Scanner(System.in); 
	  
	  int adv, retorno=0;
	  int aleatorio = Numero();
	  
	  System.out.printf("Digite seu numero: ");
	  adv = readUser.nextInt();
	  retorno = Tentativa(aleatorio,adv);
	  
	  while (retorno!=1) {
	    
	  retorno = Tentativa(aleatorio,adv);
	  
	  Object[] options = { "Tentar novamente", "Sair" };
	  int opcao = JOptionPane.showOptionDialog(null, "Você errou!", "Tentar novamente", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
	  if(opcao == 0) {
		  System.out.printf("Digite seu numero: ");
		  adv = readUser.nextInt();
		  retorno = Tentativa(aleatorio,adv);
	  }
	  else {
		  break;
	  }
	  }
	  if (retorno ==1) {
	  System.out.printf("\nVocê acertou!");}
	}
}
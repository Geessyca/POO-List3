package list3;

import java.util.Scanner;

public class question01 {
	static void Print(float num[]) {
	    float menor=num[0], maior=num[0], media=0;
	    
	    for (int i=0; i<10; i++) {
	    	media=media+num[i];
	    	if (num[i]>maior){
	    		maior=num[i];
	    	}
	    	else if (num[i]<menor){
	    		menor=num[i];
	    	}
	    }
	    
	    System.out.printf("Maior n�mero: " + maior + "\n" +
	    				  "Menor n�mero: " + menor + "\n" +
	    				  "M�dia: " + (media/10));
	    
	}
	
	public static void main(String args[]) {
		  Scanner readUser = new Scanner(System.in);
		  float num[] = new float [10];
		  for(int i=0; i<10; i++) {
			  System.out.printf("Informe o " + (i+1) + "� valor: ");
			  num[i] = readUser.nextFloat();
		  }
		  
		  for(int i=9; i>=0; i--) {
			  System.out.printf(num[i] + "  ");

		  }
		  
		  int opcao;
		  System.out.printf("\nDeseja a imprimir qual � o maior valor, o menor valor e a m�dia dos valores informados?\n"
		  		+ "0 - sim   ||  1 - n�o \n");
		  opcao = readUser.nextInt();
		  if (opcao == 0) {
			 	Print(num);
		  }
		  else {
			  System.out.printf("Finaliza o programa");
		  }
	    }
}

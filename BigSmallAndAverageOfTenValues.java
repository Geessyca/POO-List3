package List3;
//question01
public class BigSmallAndAverageOfTenValues {
	static void DefineValues(float arrayNumeric[]) {
	    float smallValue=arrayNumeric[0], bigValue=arrayNumeric[0], mediumValue=0;
	    
	    for (int itemOfArray=0; itemOfArray<10; itemOfArray++) {
	    	mediumValue=mediumValue+arrayNumeric[itemOfArray];
	    	if (arrayNumeric[itemOfArray]>bigValue){
	    		bigValue=arrayNumeric[itemOfArray];
	    	}
	    	else if (arrayNumeric[itemOfArray]<smallValue){
	    	}
	    }
	    
	    System.out.printf("Maior n�mero: " + bigValue + "\n" +
	    				  "Menor n�mero: " + smallValue + "\n" +
	    				  "M�dia: " + (mediumValue/10));
	    
	}
	
	public static void main(String args[]) {
		  float arrayNumeric[] = new float [10];
		  for(int itemOfArray=0; itemOfArray<10; itemOfArray++) {
			  arrayNumeric[itemOfArray] = GetUserUtils.getNumberFloat("Informe o " + (itemOfArray+1) + "� valor: ");
		  }
		  
		  for(int itemOfArray=9; itemOfArray>=0; itemOfArray--) {
			  System.out.printf(arrayNumeric[itemOfArray] + "  ");

		  }
		  
		  int menu;
		  menu = GetUserUtils.getNumberInt("\nDeseja a imprimir qual � o maior valor, o menor valor e a m�dia dos valores informados?\n"
			  		+ "0 - sim   ||  1 - n�o \n");
		  if (menu == 0) {
			 	DefineValues(arrayNumeric);
		  }
		  else {
			  System.out.printf("Finaliza o programa");
		  }
	    }
}

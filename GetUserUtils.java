package List3;

import java.util.Scanner;

public class GetUserUtils {
	 private static Scanner readUser = new Scanner(System.in);;
	 public String getText(String textDisplayed) {
		  System.out.printf(textDisplayed);
	      return readUser.nextLine();
	 }
	 
	 public static float getNumberFloat(String textDisplayed) {
		  System.out.printf(textDisplayed);
	      return readUser.nextFloat();
	 }
	 
	 public static int getNumberInt(String textDisplayed) {
		  System.out.printf(textDisplayed);
	      return readUser.nextInt();
	 }
	 
	 public static double getNumberDouble(String textDisplayed) {
		  System.out.printf(textDisplayed);
	      return readUser.nextDouble();
	 }
}

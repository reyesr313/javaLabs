package lab;

import java.util.Scanner;


public class FourthLab {


	public static void main(String[] args) {
	
	//User input requested
	Scanner scanner = new Scanner(System.in);
		
    System.out.println("Enter the number that's greater than 0 but less than 10: ");
    
    int n = scanner.nextInt();
    int result = factorial(n);
	  
    System.out.println("The factorial of : " + n + " is " + result);}

	public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result = result * i;
        
    }
    return result;
   
   //String choice;
  // while (choice.equalsIgnoreCase("y")) 
   //System.out.println("Continue? (y/n): ");
	
	//System.out.println();

	
}
}


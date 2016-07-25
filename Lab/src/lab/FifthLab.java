package lab;

import java.util.Random;
import java.util.Scanner;
	
public class FifthLab {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int firstRoll = 0;
			String answer = "y";
			int num1;
			int num2;
			Random randomValue = new Random();
			
			
			System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n):");
			answer = scan.nextLine();
			
			if (answer.equalsIgnoreCase("y")){
				
			}
			do {				
					num1 = randomValue.nextInt(6);
					num2 = randomValue.nextInt(6);
					if (num1==0)num1 = 1;
					if (num2==0)num2 = 1;
			
			System.out.println("Roll:" + num1+ "&" + num2);
			}
			while ((firstRoll == 7) || (firstRoll == 11)); 
				System.out.println("Winner!");
				

				System.out.println("Roll again? (y/n):");
				answer = scan.nextLine();
				
			
				
				if ((firstRoll == 2) || (firstRoll == 3) || (firstRoll == 12)) {
					System.out.println("You Lose!");
					

					System.out.println("Roll again? (y/n):");
					answer = scan.nextLine();
			
				}
				System.out.println("Goodbye!");
			}
				
				
		}

				
			
			
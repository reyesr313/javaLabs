package lab;

import java.text.NumberFormat;
import java.util.Scanner;

public class FirstLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//user input requested
		
	System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	Scanner scan = new Scanner(System.in);
	String choice = "y";
	while(choice.equalsIgnoreCase("y")){
		
		//user input for room calculation
		System.out.print("Enter Length: ");
		double length = scan.nextDouble();
		System.out.print("Enter Width: ");
		double width = scan.nextDouble();
		System.out.println();
		
		//calculations for area and perimeter
		double area = (length * width);
		double perimeter = (2*(length + width));
		
		//get and set number formats from java utilities
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(0);
		String areaFormatted = number.format(area);
		String perimeterFormatted = number.format(perimeter);
		
		//print out calculation results and see if user wants to continue
		System.out.println("Perimeter: " + perimeterFormatted + " ft");
		System.out.println("Area: " + areaFormatted + " ft/-2");
		
		System.out.println("Continue? (y/n): "); 
		System.out.println();
	}
	scan.close();
	System.out.println("Bye!");
}

		

	
		
	}



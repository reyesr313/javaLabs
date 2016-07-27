package lab;

import java.util.Scanner;

public class SixthLab {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to the Pig Latin Translator\n:");
while (true){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a line to be translated to Pig Latin:");
	String line = sc.nextLine();
	
	if (line.equals("")){
		System.out.println("You didn't enter anything.");
	} else {
		String [] words = line.split(" ");
		String pigLatin = "";
		for (String word : words) {
			pigLatin += SixthLabb.translateToPigLatin (
					word.toLowerCase()) +"";
		}
		System.out.println();
		System.out.println(pigLatin);
		}
	System.out.print("Translate another line? (y/n: )");
	
	String choice =sc.nextLine();
	if(choice.equalsIgnoreCase("y")){
	continue;	
	
	}else {
	System.out.println("Goodbye!");		
		break;
		
	
	}
	
	}
}
	}


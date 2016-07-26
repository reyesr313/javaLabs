package lab;

import java.util.Scanner;

public class SecLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		String name;
		String choice;
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Welcome! What is your name?");
		name = scan.nextLine();
		System.out.println();
		
		System.out.println("Would you like to play a game? (y/n)"); 
		choice = scan.nextLine();
		System.out.println();
		
		switch (choice) {
		case "y":
		System.out.println("Excellent, " + name	+ "! You are walking across a field and you encounter a"+ 
		" fire-breathing dragon! What would you do? (enter face the beast or run away )");
		choice = scan.nextLine();
		
		switch (choice) {
		case "face the beast":
		System.out.println("You approach the dragon. You see that it has _ heads. (enter 1 or 2 or 3)");
		choice = scan.nextLine();
		System.out.println();
		
		switch (choice) {
		case "1":
		System.out.println("1-headed dragons have been slayed in adventures past, so I'm confident you can handle him, " + name + ". "
		+ " (enter slingshot or sword or bow and arrow): ");
		choice = scan.nextLine();
		System.out.println();
		break;
		
		case "2":
		System.out.println("2-headed dragons are most dangerous! However, you are a courageous warrior" + name +
		" (enter slingshot or sword or bow and arrow): ");
		choice = scan.nextLine();
		System.out.println();
		break;
		
		case "3":
		System.out.println(name + ", no one has dared face a 3-headed dragon before! What a noble and brave adventurer you are! Choose your weapon"
		+ " (enter slingshot or sword or bow and arrow): ");
		choice = scan.nextLine();
		System.out.println();
		}
		switch (choice) {
		
		case "slingshot":
					
		System.out.println("Armed with your slingshot you approach the dragon. You feel its fiery breath as "
		+ "you appraoch." 	+ " It stares at you with its ___ eyes. (enter red or blue) ");
		choice = scan.nextLine();
		System.out.println();
		
		break;
		
		case "sword":
			
		System.out.println	("Armed with your sword you approach the dragon. You feel its fiery breath as you "
		+ "appraoch." 	+ " It stares at you with its ___ eyes. (enter red or blue) ");
		choice = scan.nextLine();
		System.out.println();
		
		break;
			
		case "bow and arrow":
				
		System.out.println("Armed with your bow and arrow you approach the dragon. You feel its fiery breath as you"
		+ " appraoch." 	+ " It stares at you with its ___ eyes. (enter red or blue) ");
		
		choice = scan.nextLine();
		System.out.println();
		}
		switch (choice) {
		case "red":
		System.out.println("Red-eyed dragons are the rarest dragons known to man. These are friendly beasts, "
		+ "you pet the dragon and become friends." 	+ " Choose a name for your new friend. (enter a name):");
		
		choice = scan.nextLine();
		System.out.println();
		break;
		
		case "blue" :
		System.out.println("Blue-eyed dragons are the rarest dragons known to man. These are friendly beasts, "
		+ "you pet the dragon and become friends." 	+ " Choose a name for your new friend. (enter a name):");
		
		choice = scan.nextLine();
		System.out.println();
		
		System.out.println(name + " and " + choice + " lived on to see many great adventures together! The end.");
	
		System.out.println("GAME OVER!"); 
		scan.close();				
		break;				}		
			}
		}
		
	
}

}
	

	



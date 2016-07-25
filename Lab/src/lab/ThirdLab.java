package lab;
import java.util.Scanner;
public class ThirdLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int numSquared = 0;
		int numCubed = 0;
		String choice = "y";
		
		System.out.println("Learn your squares and cubes!");
				
		while (choice.equalsIgnoreCase("y")) {
			
		System.out.println("Enter an integer: "); 
			
		num = scan.nextInt(); 
				
		if(num > 0) {
		
			System.out.println("Number" + "		" + "Squared" + "		" + "Cubed");
			System.out.println("======" + "     " + "     ====== "+ "       " + "  =====");
					
				
			for(int i = 1; i <= num; i ++){
			numSquared = (i * i);
			numCubed = (i * i * i);
						
			String formattedTable = i + "		" + numSquared + "		" + numCubed;
			System.out.println(formattedTable);
					}
				}
			
			System.out.println("Continue? (y/n): ");
			choice = scan.next();
			System.out.println();
			
		}
		scan.close();
		System.out.println("Thanks for playing. Bye!");
		}
		
	
		
	}

	



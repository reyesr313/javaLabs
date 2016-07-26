package lab;
import java.util.ArrayList;
import java.util.Scanner;

public class EighthLab {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> noZeros = new ArrayList<Float>();

		System.out.println("Welcome to Grand Circus Stadium");
			
		System.out.println("Enter times at bat: ");
		
		int bats = 0;
		
		System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home Run");
		
		float sum = 0;
				
		Scanner sc = new Scanner (System.in);
		bats = Integer.parseInt(sc.nextLine()); 
		float[] timesAtBat = new float[bats];
		System.out.println(timesAtBat.length);
		
		for (int i = 0; i < timesAtBat.length; i++) {
			int x=i+1;
			System.out.println("Enter input number for "+ x);
			int inputWhatHappened = Integer.parseInt(sc.nextLine());
			timesAtBat[i] = inputWhatHappened;
			sum += timesAtBat[i];
			
		}
		System.out.println("Slugging Percentage:" + sum / timesAtBat.length);

	}

}

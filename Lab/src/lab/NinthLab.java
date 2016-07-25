package lab;

import java.util.Scanner;
import java.lang.Math;

public class NinthLab {

	 public static double getCircumference(double radius) {
	        return 2 * Math.PI * radius;
	    }

	    public static double getArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	 
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println ("Welcome to the Circle Tester");
	        System.out.println ("Enter Radius:");
	        
	        double radius = sc.nextDouble();

	        System.out.println("Circumference: ");
	        System.out.println (NinthLab(radius));
	        System.out.println("Area: ");
	        System.out.println(getArea(radius));
	        
	        System.out.println("Continue? (y/n): ");
			choice = scan.next();
			System.out.println("Goodbye!");

	        sc.close();
	    }

	

	



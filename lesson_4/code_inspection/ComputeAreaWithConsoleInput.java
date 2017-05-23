import java.util.Scanner;

public class ComputeAreaWithConsoleInput{
	public static void main(String[] args){

		//declare variables
		double radius;
		double area;

		//create a scanner object
		Scanner input = new Scanner(System.in);

		//Prompt user to enter a radius
		System.out.print("Enter a number for radius: ");

		//read radius from console(keyboard)
		radius = input.nextDouble();

		//compute area
		area=radius*radius*3.14159;

		//display result
		System.out.println("The area for the circle with the radius of " + radius + " is " + area);

		}//end main

	}//end class

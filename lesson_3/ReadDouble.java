import java.util.Scanner;

public class ReadDouble {
	public static void main(String[] args){

		//variable declarations
		double deposit;

		//create scanner object
		Scanner input = new Scanner(System.in);

		//prompt user for deposit amount
		System.out.print("Please enter the amount you wish to deposit: ");

		//read deposit amount (double) from keyboard
		deposit = input.nextDouble();

		//display the amount deposited
		System.out.println("You wish to deposit $" + deposit);

		
		}//end main method
}//end class

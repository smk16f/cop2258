import java.util.Scanner;

public class ReadWord {

	public static void main(String[] args) {
		//declare variables
		String fname = "";
		String lname = "";
		String name="";
		//create scanner object
		Scanner input = new Scanner(System.in);
		//prompt user for their first and last name
		System.out.print("Please enter your first and last name: ");
		//read users first name
		//fname = input.next(); //reads line until there is a space
		//read users last name
		//lname = input.next();
		//read the entire name of the user
		name = input.nextLine();
		//display message to user
		System.out.println("Thank you " + name + "!");
		}//end of main
}//end of class

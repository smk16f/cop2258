import java.util.Scanner; //imports scanner method

public class ScannerError{
	public static void main(String[] args){

		//declare variables
		int age;
		double gpa;
		String city;
		//create scanner object "input"
		Scanner input = new Scanner(System.in);
		//prompt user for input of age and gpa
		System.out.print("How old are you? What is your GPA? ");
		//read age from keyboard
		age= input.nextInt();
		//read gpa from keyboard
		gpa= input.nextDouble();
		//display message to user using age nad gpa
		System.out.println("Wow! You're " + age + " and you can still get a " + gpa + "gpa?!");
		//prompt user for the city where they live
		System.out.println("What city do you live in?");
		//read city from keyboard
		input.nextLine();
		city = input.nextLine();
		//display message to user using city
		System.out.println("Wow I've heard that " + city + " is nice");
	}//end main
}//end class

// Step One : import Scanner class and the rest of util package
import java.util.*;

public class ReadInt {
	public static void main(String[] args) {
		//declare variables
		int age;
		//Step Two: create scanner object
		Scanner input=new Scanner(System.in);
		//Step Three: prompt user for input
		System.out.print("Please enter your age: ");
		//Step four: read user input
		age=input.nextInt();
		//Step Five: display user age in five years
		System.out.println("You are now " + age + " in five years you will be " + (age+5));

}//end of main
}//end of class

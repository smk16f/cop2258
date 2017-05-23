/* 
Program Name: DollarsToEurosConverter.java
Student Name: Stephen Keating
Date: 02/08/2017
Purpose: To convert dollars to euros.
*/
//imports Scanner methods
import java.util.Scanner;
//starts class DollarsToEurosConverter
public class DollarsToEurosConverter{
    //Starts main method
	public static void main(String[] args){
	    //declare variables
	    double dollar;
	    double euro;
	    double exchangeRate;
	    
	    //starts scanner method
	    Scanner input = new Scanner(System.in);
	    
		//Prints welcome message
		System.out.println("\n******************************************************************************");
        System.out.println("\n*                      WELCOME TO THE BASIC MATH GAME                        *");
        System.out.println("\n******************************************************************************");
        //asks user how many dollars they want o convert
        System.out.print("How many dollars do you want to convert? ");
        //read user input from keyboard for dollar amount
        dollar= input.nextDouble();
        //Asks user what the exchange rate is
        System.out.print("WHat is the euros-per-dollar exchange rate? ");
        //read user input form keyboard for exchange rate
        exchangeRate= input.nextDouble();
        //compute exchange rate
        euro= dollar * exchangeRate;
        //Print result
        System.out.println(dollar + " dollars is converted to "+ euro + " euros.");
    }//end main
}//end class

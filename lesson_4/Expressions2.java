/*************************************************************************
 * File Name: Expressions.java
 * 
 * Due Date:  03/03/2017
 * 
 * Author:  Stephen Keating
 * 
 * Program Description:   Display the output of the program using user defined input.
 * 
 * Input:      Takes in user inpiut for variables x and n.
 *              
 * Processing:  Uses algorithm to calculate the value of the expression using the values x and n supplied by user.
 * 
 * Output:      Will print the total value of the expression using the variables provided by the user.
 * 
 * ***********************************************************************/
 
import java.util.*;//imports the .util java library  for use throughout the program

public class Expressions2 {
  public static void main(String[] args) { 
  
      double x;
      double n;
      double result;
      //declares variables
      Scanner input = new Scanner(System.in);
      //Declares scanner input
      System.out.print("Please enter a value for x: ");
      //prompts user for value for variable x
      x = input.nextDouble();
      //stores user input in variable x
      System.out.print("Please enter a value for n: ");
      //prompts user value for variable n
      n = input.nextDouble();
      //stores user value for variable n
      result = ((Math.pow((1+x),n))) + (n*x) + (n*(n-1))*Math.pow(x,2)/2;
      //sets the equation
      System.out.println("The Result of the Expression is: " + result);
      //prints the result of the equation
      
  }//end main
  
}//end class

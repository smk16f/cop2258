/*************************************************************************
 * File Name: Expressions.java
 * 
 * Due Date:  03/03/2017
 * 
 * Author:  Stephen Keating
 * 
 * Program Description:   Display the output of the program using fixed values x=5, n=2.
 * 
 * Input:       Does not take in user input.
 *              
 * Processing:  Uses algorithm to calculate the value of the expression using the values 5 and 2.
 * 
 * Output:      Will print the total value of the expression using the declared variables.
 * 
 * ***********************************************************************/

public class Expressions {
  public static void main(String[] args) { 
  
      double x=5;
      double n=2;
      double result;
      //declares variables
      
      result = ((Math.pow((1+x),n))) + (n*x) + (n*(n-1)) * Math.pow(x,2)/2;
      //sets the equation
      System.out.println("The Result of the Expression is: " + result);
      //prints the result of the equation
      
  }//end main
  
}//end class

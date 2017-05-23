/*************************************************************************
 * File Name: LoanFutureValue.java
 * 
 * Due Date:  02/24/2017
 * 
 * Author:  Stephen Keating
 * 
 * Program Description:   The Loan Future Value calculator is designed to take in user input and tell them how much interest their loan accumulates.
 * 
 * Input:       Takes in initial investment amount, interest rate and number of years on the loan
 *              
 * Processing:  Uses algorithm to calculate interest  
 * 
 * Output:      Will show total value of the initial investment plus the acculmulated interest
 * 
 * ***********************************************************************/

import java.util.*;//imports the .util java library  fro use throughout the program

public class LoanFutureValue {
  public static void main(String[] args) { 
  
    double futureInvestmentValue;
    double investmentAmount;
    int numberOfYears;
    double yearlyInterestRate;
    double monthlyInterestRate;
    //Declares variables that will be used throught the program.
    
    Scanner input = new Scanner(System.in);
    //Declares scanner input for use throughout the program

    System.out.println("* ***********************************************************************");
    System.out.println("*                    Accumulated Investment Value                       *");
    System.out.println("* ***********************************************************************");
      
    System.out.print("Enter the investment amount, for example 120000.95: ");
    //prompts user for input and includes acceptable example
    
    investmentAmount = input.nextDouble();
    //reads investment amount from user input

    System.out.print("Enter annual interest rate, for example 8.25: ");
    //prompts user for annual interest rate and includes example for user input
  
    yearlyInterestRate = input.nextDouble();
    //reads interest rate from user input
 
    System.out.print("Enter number of years as an integer, for example 5: ");
    //prompts user for term of loan in years, and includes an example
   
    numberOfYears = input.nextInt();
    //reads amount of years the loan will be

    monthlyInterestRate = yearlyInterestRate / 1200;
    //converts yearlyInterestRate to monthlyInterestRate
      
    futureInvestmentValue = investmentAmount * Math.pow((1+monthlyInterestRate),(numberOfYears*12));
    /*
    futureInvestmentValue is calculated by taking the investment amount and multiplying it by one plus 
    the monthly interest rate raised to the power of 12 multiplied by the numberOfYears, or term of the 
    investment.
    */
    System.out.println("* ***********************************************************************");
    System.out.printf("                      Future value is $%.2f \n", futureInvestmentValue);
    System.out.println("* ***********************************************************************");
    //prints value of the futureInvestmentValue.
    
  }//end of main method
  
}//end of LoanFutureValue class
/*************************************************************************
 * File Name: SeminoleBank_B.java
 * 
 * Due Date:  04/14/2017
 * 
 * Author:  Stephen Keating
 * 
 * Program Description:  Enter account number and select a menu item to update account.
 * 
 * Input:       Takes in user account number, menu choice, and account transactions
 *              
 * Processing:  processes user input, if correct input is given, prints results requested by user, otherwise presents error to user.
 * 
 * Output:      Prints user selections to the terminal.
 * 
 * ***********************************************************************/

import java.util.Scanner; //needed to use Scanner for input

public class SeminoleBank_B {//beinging of class
  public static void main(String[] args) {//beinging of main
   
        //variable declarations
        String menuChoice;
        int accountNumber;
        double balance = 1000;
        double deposit;
        double withdrawal;
        
                
        Scanner input = new Scanner(System.in);//Scanner initialized
        
        //welcome banner
        System.out.println("*******************************************************");
        System.out.println("              Welcome to Seminole Bank!");
        System.out.println("*******************************************************");
        
        //account number prompt
        System.out.print("Please enter your 5-digit Seminole Account Number: ");
        accountNumber = input.nextInt();//takes in user input for account number
        System.out.println("\nThank You!\n");
        
        System.out.print("Enter D for deposit, W for Withdrawal, B for Balance, or X to exit the menu: ");//prints menu options
        menuChoice = input.next();//takes in user input
        menuChoice = menuChoice.toUpperCase();//assigns capitalized value to input so that the string can be read correctly by complier
        do
        {

                if(menuChoice.equals("D"))//if user selects option d
                {
                    System.out.print("Enter the amount of the deposit: ");//prompt for deposit ammount
                    deposit = input.nextDouble();//takes in user input
                    balance = balance + deposit;//calculates new balance
                }
                
                else if(menuChoice.equals("W"))//if user selects option w
                {
                    System.out.print("Enter amount of the withdrawal: ");//prompt for user input
                    withdrawal = input.nextDouble();//takes in user input
                    balance = balance - withdrawal;//calculates new balance
                }
                
                else if(menuChoice.equals("B"))//if user selects option b
                {
                    System.out.printf("Account number: " + accountNumber + " has a current balance of: $ %.2f \n", balance);//prints current balance
                }
                
                else
                    System.out.println("\nERROR: Please select from the following menu options: D, W, B, or X\n");//catches any user intput that is not assigned in the menu
                 
                System.out.print("Enter D for deposit, W for Withdrawal, B for Balance, or X to exit the menu: ");//prompts for users next action
                menuChoice = input.next();//takes in user input
                menuChoice = menuChoice.toUpperCase();//assgins a capitalized value to it
            }
            while(!menuChoice.equals("X"));//while menuChoice does not equal x the loop will continue)
            System.out.println("\n\nThank you for being a loyal Seminole Bank customer!");//prints thank you statement
            
            
        }//end main
  }//end class

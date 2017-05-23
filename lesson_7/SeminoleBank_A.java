/*************************************************************************
 * File Name: EminoleBank_A.java
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

public class SeminoleBank_A {//beinging of class
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
        accountNumber = input.nextInt();
        System.out.println("\nThank You!\n");
        
        System.out.print("Enter D for deposit, W for Withdrawal, B for Balance, or X to exit the menu: ");
        menuChoice = input.next();
        menuChoice = menuChoice.toUpperCase();
        while(!menuChoice.equals("X"))
        {

                if(menuChoice.equals("D"))
                {
                    System.out.print("Enter the amount of the deposit: ");
                    deposit = input.nextDouble();
                    balance = balance + deposit;
                }
                
                else if(menuChoice.equals("W"))
                {
                    System.out.print("Enter amount of the withdrawal: ");
                    withdrawal = input.nextDouble();
                    balance = balance - withdrawal;
                }
                
                else if(menuChoice.equals("B"))
                {
                    System.out.printf("Account number: " + accountNumber + " has a current balance of: $ %.2f \n", balance);
                }
                
                else
                    System.out.println("\nERROR: Please select from the following menu options: D, W, B, or X\n");
                 
                System.out.print("Enter D for deposit, W for Withdrawal, B for Balance, or X to exit the menu: ");
                menuChoice = input.next();
                menuChoice = menuChoice.toUpperCase();
            }
            System.out.println("\n\nThank you for being a loyal Seminole Bank customer!");
            
            
        }
  }

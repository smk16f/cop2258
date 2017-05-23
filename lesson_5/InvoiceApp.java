/*************************************************************************
 * File Name: InvoiceApp.java
 * 
 * Due Date:  03/10/2017
 * 
 * Author:  Stephen Keating
 * 
 * Program Description:   The Invoice Application takes in a users customer type and subtotal then calculates the discount they recieve based upon their customer type. 
 * 
 * Input:       Takes in customer type and subtotal
 *              
 * Processing:  Uses algorithm to calculate discount based off of user customer type and subtotal.
 * 
 * Output:      Will show subtotal, customer type, discount percent, discount amount, and total.
 * 
 * ***********************************************************************/
import java.util.Scanner;
 
public class InvoiceApp
{
    public static void main(String[] args)
    {
        
    int customerType;
    double subtotal;
    double discountPercent = 0;
    double discountAmount;
    double total;
    //Variable declarations
    
    Scanner input = new Scanner(System.in);
    //Scanner declaration
    
    System.out.println("* ***********************************************************************");
    System.out.println("*             Welcome to the Invoice Total Calculator                   *");
    System.out.println("* ***********************************************************************");
    //Shows welcome banner 
 

    System.out.print("Please enter customer type (Enter 1 for Silver, 2 for Gold, or 3 for Platinum): ");
    //Prompts user for customer type
    
    customerType = input.nextInt();
    //Takes in value for customerType from user
           
    System.out.print("Please enter the subtotal: ");
    //prompts user for subtotal value
    
    subtotal = input.nextDouble();
    //takes in value for subtotal
    
    switch (customerType)
    {
        case 1 : 
            if (subtotal>=500)
            {
                discountPercent = .2;
                break;
            }
            else if(subtotal<500 && subtotal >=250)
            {
                discountPercent = .15;
                break;
            }
            else if(subtotal<250 &&subtotal >= 100)
            {
                discountPercent = .1;
                break;
            }
            else if(subtotal < 100)
            {
                break;
            }
        case 2 : 
            discountPercent = .2;
            break;
        case 3 :
            if (subtotal>=500)
            {
                discountPercent = .5;
                break;
            }
            else if (subtotal<500)
            {
                discountPercent = .4;
                break;
            }
        default: 
            {
                discountPercent = .05;
                break;
            }
    }
        discountAmount = subtotal * discountPercent;
        //Calculates Discount Rate
        
        total = subtotal - discountAmount;
        //Calculates Invoice Total

    System.out.println("* ***********************************************************************");
    System.out.println("                           INVOICE REPORT: ");
    System.out.printf("                Subtotal:           %.2f \n", subtotal);
    System.out.println("                Customer Type:      " + customerType);
    System.out.printf("                Discount percent:   %.2f \n", discountPercent);
    System.out.printf("                Discount amount:    %.2f \n", discountAmount);
    System.out.printf("                Total:              %.2f \n", total);
    System.out.println("");
    System.out.println("                            Thank you!!");
    System.out.println("");
    System.out.println("* ***********************************************************************");
        

       
    }//end of main
}//end of class
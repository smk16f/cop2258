/*************************************************************************
 * File Name: Pandora.java
 * 
 * Due Date:  03/31/2017
 * 
 * Author:  Stephen Keating
 * 
 * Program Description:  Enter name and select a menu item to show results.
 * 
 * Input:       Takes in users last name and menu choice
 *              
 * Processing:  processes user input, if correct input is given, prints results requested by user, otherwise presents error to user and exits app.
 * 
 * Output:      Prints user selections to the terminal.
 * 
 * ***********************************************************************/
import java.util.Scanner; //needed to use Scanner for input

public class Pandora {//beinging of class
  public static void main(String[] args) {//beinging of main
   
        //variable declarations
        String lname;
        String newChannel;
        String scanPrint = "j";
        int menuChoice;
        int channelChoice;
        
        Scanner input = new Scanner(System.in);//Scanner initialized
    
            //Shows welcome banner and prompts user for last name and menu choice
        System.out.println("*********************WELCOME TO PANDORA!**********************");
        System.out.println();
        System.out.println("            PANDORA MENU:");
        System.out.println("            1 - Create New Pandora Channel");
        System.out.println("            2 - Play Pandora Channel");
        System.out.println("            3 - Exit Pandora");
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println();
        System.out.print("Please enter your last name followed by your Pandora Menu Choice: ");


        lname = input.next();//reads users last name
        menuChoice=input.nextInt();// reads users menuchoice and brings cursor to next line
        
        lname = lname.toUpperCase();//Converts last name to uppercase
        
        switch(menuChoice)//controls menu choices of user
        {
        case 1:
            System.out.println("You have selected Create New Pandora Channel menu item!");
            System.out.print("Please enter the name of the new channel: ");
            newChannel = input.next();
            newChannel = newChannel.toUpperCase();
            System.out.println("\nYou have successfully created the following channel: " + newChannel);
            break;
        case 2:
            System.out.println("You have selected the PLAY PANDORA CHANNEL menu item\n");
            System.out.println("The user " + lname + " currently has created the following stations: \n");
            System.out.println("1. Aretha Franklin");
            System.out.println("2. Bruno Mars");
            System.out.println("3. Madonna");
            System.out.println("4. Prince");
            System.out.println("5. Lady Gaga");
            System.out.println("6. Cage the Elephant");
            System.out.println("7. Rage Against the Machine");
            System.out.println("8. 90s Alternative");
            System.out.println("9. Electronica");
            System.out.println("10. Metallica\n");
            System.out.print("Which channel would you like to listen to? (Enter 1,2,3,4,5,6,7,8,9, or 10): ");
            channelChoice = input.nextInt();
            if (channelChoice == 1)
            {
                scanPrint = "Aretha Franklin";
            }
            else if (channelChoice == 2)
            {
                scanPrint = "Bruno Mars";
            }
            else if (channelChoice == 3)
            {
                scanPrint = "Madonna";
            }
            else if (channelChoice == 4)
            {
                scanPrint = "Prince";
            }
            else if (channelChoice == 5)
            {
                scanPrint = "Lady Gaga";
            }
            else if (channelChoice == 6)
            {
                scanPrint = "Cage the Elephant";
            }
            else if (channelChoice == 7)
            {
                scanPrint = "Rage Against the Machine";
            }
            else if (channelChoice == 8)
            {
                scanPrint = "90's Alternative";
            }
            else if (channelChoice == 9)
            {
                scanPrint = "Electronica";
            }
            else if (channelChoice == 10)
            {
                scanPrint = "Metallica";
            }
            else if (channelChoice < 1 || channelChoice > 10)
            {
                scanPrint = "channel selection unavailable!";
            }
            scanPrint = scanPrint.toUpperCase();
            
            System.out.println("\nYou are now listening to : " + scanPrint);
            
            break;                                        
        case 3:
            
            System.out.println(" You have selected the EXIT PANDORA menu item!");
         
            break;
        default:
            System.out.println("\nINCORRECT MENU SELECTION");
            break;
        }
        System.out.println("\n" + lname +"! Thank you for being a valued listener!\n\n");
        
        System.out.println("**************GOODBYE PANDORA LISTENER*****************");
      
  }//end of main
}//end of class
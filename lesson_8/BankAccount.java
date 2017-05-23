import java.util.Scanner;

public class BankAccount{
        //Main Function
        public static void main(String []args){
                //Declare and initialize a variable for balance to $5000.
                double balance = 5000.00;
                //Declare other variables as needed
                Scanner input = new Scanner(System.in);//Scanner initialized

                welcomeMessage();
                int accountNumber = accountInfo();
                char menuChoice = ' ';
                do{
                        char choice = displayMenu();
                        menuChoice = choice;
                        switch(menuChoice){
                            
                                case 'D':
                                        balance = depositFunds(balance);
                                        break;
                                case 'W':
                                        balance = withdrawFunds(balance);
                                        break;
                                case 'B':
                                        checkBalance(accountNumber, balance);
                                        break;
                                case 'X':
                                        break;
                            
                                default:
                                        System.out.println("ERROR: Please enter a D, W, B, or X: ");
                                
                                
                        }//end of switch     
             
                }while(menuChoice != 'X');  
        
            
            System.out.println("Thank you for using the Seminole Banking Application! Have a nice day!");
            
        }//end of main
        
             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/
         //Display welcome message 
         public static void welcomeMessage(){             
        //welcome banner
        System.out.println("*******************************************************");
        System.out.println("              Welcome to Seminole Bank!");
        System.out.println("*******************************************************");
         }//end of welcomeMessage

         public static int accountInfo (){
        Scanner input = new Scanner(System.in);//Scanner initialized
        int accountNumber = 0;  
        //account number prompt
        System.out.print("Please enter your 5-digit Seminole Account Number: ");//promtp iser for input
        accountNumber = input.nextInt();//takes in user input
        System.out.println("\nThank You!\n");
        return accountNumber;//returns accountNumber to main
        
         }//end of accountInfo

         public static char displayMenu (){
        Scanner input = new Scanner(System.in);//Scanner initialized
        char menuChoice;
        String choice;
        System.out.print("Enter D for Deposit, W for withdrawl, B for balance, or X to exit the menu: ");//promtp user for input
        choice = input.next();//accept user input
        choice = choice.toUpperCase();//converts choice to uppercase for switch 
        menuChoice = choice.charAt(0);//converts choice to char
        return menuChoice;//returns menuChoice to main
        
         }//end of displayMenu
         
         //Prompt the user for the amount to deposit and Read deposit amount.  Update the balance and RETURN the balance to main().
         public static double depositFunds(double balance){
        double newBalance = 0.0;
        double deposit = 0.0;
        Scanner input = new Scanner(System.in);//Scanner initialized
        System.out.print("Please enter the amount of the deposit: ");//promtp user for input
        deposit = input.nextDouble();//accept user input
        newBalance = balance + deposit;//calcuates balance
        return newBalance;//returns new balance to main
         }//end of depositFunds
         
         //Prompt the user for the amount to withdraw and Read withdrawal amount.  Update the balance and RETURN the balance to main().
         public static double withdrawFunds (double balance){
        double newBalance = 0.0;
        double withdrawal = 0.0;
        Scanner input = new Scanner(System.in);//Scanner initialized
        System.out.print("Please enter the amount you wish to withdraw: ");//promtp user for input
        withdrawal = input.nextDouble();//accept user input
        newBalance = balance - withdrawal;//calculates balance
        return newBalance;//returns balance to main
         }//end of withdrawFunds
         
         public static void checkBalance(int accountNumber, double balance){
             System.out.printf("Account number: " + accountNumber + " has a current balance of: $%.2f\n",balance);
         }//end of checkBalance
         
        /**************************************************END OF FUNCTION DEFINITIONS **************************************************/
}//end of BankAccount Class
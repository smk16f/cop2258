import java.util.Scanner;

public class MenuChoice1 {
    public static void main(String[] args) {
        ///declare variables
        String choice = "";
        
        //create scanner
        Scanner input = new Scanner (System.in);
        
        //prompt user for menu choice
        System.out.print("Please enter you menu choice: ");
        
        //read menu choice from terminal
        choice = input.next();
        
        //control statment to determine what prints to terminal
        if(choice.equals("A") || choice.equals("a"))
        {
            System.out.println("Apple");
        }
        else if (choice.equals("B") || choice.equals("b"))
        {
            System.out.println("Ball");
        }
        else if (choice.equals("C") || choice.equals("c"))
        {
            System.out.println("Cat");
        }
        else
        {
            System.out.println("You have enter an invalid menu choice");
        }
    }
}
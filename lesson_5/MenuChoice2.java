import java.util.Scanner;

public class MenuChoice2 {
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
    switch (choice)
    {
        case "A" : case "a" :
        {
            System.out.println("Apple");
            break;
        }
        case "B" : case "b" :
        {
            System.out.println("Ball");
            break;
        }
        case "C" : case "c" :
        {
            System.out.println("Cat");
            break;
        }
        default : 
        System.out.println("You have entered an invalid option");
        break;
    }
    }
}
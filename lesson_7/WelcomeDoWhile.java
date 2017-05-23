import java.util.Scanner;

public class WelcomeDoWhile{
    
    public static void main(String [] args){
        
        //this is an example of a post test loop using a do while loop
        
        //1. initializing the loop control variable
        int count = 0;
        
        do {
            System.out.println("Welcome to FSU!");
        //2. modify count variable
            count++;
            
        //3. condition is either true or false
        }while (count < 5);
    }//end of main
}//end of class
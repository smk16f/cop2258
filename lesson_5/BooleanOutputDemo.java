//Application - BooleanOutputDemo
//Description - This application indicates whether the response to a quiz question is true or false.
import java.util.Scanner; 
public class BooleanOutputDemo {
  public static void main(String[] args) {
    //declare variables
    boolean answer;
      
    // Create a Scanner
    Scanner in = new Scanner(System.in);

    // Step #1:  Ask user quiz question
    System.out.println("Enter a 1 if you think the sun travels east to west");
    System.out.println("Enter a 2 if you think the sun travels west to east");
      
    //Step #2:  Get user's response  
    int response = in.nextInt();

    //Step #3:  Boolean Expression to determine if response was correct
    
    if (response == 1)//if user enters 1, then print true
        answer = true;
    else                //if user enters anything else, it is false
        answer = false;
     
    //Step #4:  Display if answer was true or false
    System.out.println("Your answer is " + answer);
      
  }//end of main
}//end of class
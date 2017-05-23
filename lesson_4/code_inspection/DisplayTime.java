import java.util.Scanner;

public class DisplayTime {
  public static void main(String[] args) {
      
    //Create Scanner Object 
    Scanner input = new Scanner(System.in);
      
    // Prompt the user for input
    System.out.print("Enter an integer for seconds: ");
      
    //Read the time in seconds 
    int seconds = input.nextInt();
 
    int minutes = seconds / 60; // Find minutes in seconds
    int remainingSeconds = seconds % 60; // Seconds remaining
      
    //Display time in minutes and remaining seconds
    System.out.println(seconds + " seconds is " + minutes + 
      " minutes and " + remainingSeconds + " seconds");  
  } //end of main
}  //end of class



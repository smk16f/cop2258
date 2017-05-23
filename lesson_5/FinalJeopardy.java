/*************************************************************************
 * File Name: FinalJeopardy.java
 * 
 * Due Date:  03/24/2017
 * 
 * Author:  Stephen Keating
 * 
 * Program Description:   Select a final jeopardy question, and answer. If correct you win
 * 
 * Input:       Takes in question selection and answer
 *              
 * Processing:  processes user input, if correct shows correct statements, otherwise prints losing statement.
 * 
 * Output:      Will notify user if they are correct or incorrect.
 * 
 * ***********************************************************************/
import java.util.Scanner;
 
public class FinalJeopardy {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);//Scanner initialized
    int answer;//int value declared
      
    //declare and initalize text responses to the player  
    String loose = "\n\t\tSORRY!  YOU LOSE!  THANKS FOR PLAYING FINAL JEOPARDY!\n\n";
    String win = "\n\t\tCONGRATULATIONS!  YOU WIN FINAL JEOPARDY!\n\n";
    String incorrectSelection = "\nYou've enter an invalid number!!  YOU LOSE!  Try again next time!\n\n";
      
    //Create (declare & initalize) questions for the game  
    String question1, question2, question3, question4, question5, question6;
      
    question1 = "How do crickets hear?";
    question2 = "What\'s the best way to stop crying while peeling onions?";
    question3 = "Which animal sleeps for only five minutes a day?";        
    question4 = "What does ponophobia mean?";
    question5 = "When did the Liberty Bell get its name?";
    question6 = "The where did Daniel Boon die?";
     
    //Start the game 
    System.out.println("\n\n\t\t\tWelcome to Final Jeopardy!");
      
    System.out.println("\n\nRules:  You must answer the question correctly to win Final Jeopardy.  Good Luck! ");
    
    System.out.println("\n\n\nSelect one of the questions below to play Final Jeopardy: (enter 1-4)\n");
    System.out.printf("\t1. %s \n", question1);
    System.out.printf("\t2. %s \n", question2);  
    System.out.printf("\t3. %s \n", question3);
    System.out.printf("\t4. %s \n", question4);
    System.out.printf("\t5. %s \n", question5);
    System.out.printf("\t6. %s \n", question6);
 
      
    //Prompt the user for their selection  
    System.out.print("\n\nWhich question would you like? "); 
    int selection = input.nextInt();
      
    
    //Validate user selection  
    if (((selection < 1)  || (selection > 6)))  {
        System.out.println(incorrectSelection);

    }  else { 
     
            switch (selection) {
                case 1: System.out.println("\n\nYou\'ve selected:  \t" + question1);
                        System.out.println("\n\nSelect the correct answer for Question 1: (enter 1-4)");
                        System.out.println("\t 1.  What is through their wings?        3.  What is through their belly?");
                        System.out.println("\t 2.  What is through their knees?        4.  What is through their tongues?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 3 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 2) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection);  
                
                case 2: System.out.println("\n\nYou\'ve selected:  \t" + question2);
                        System.out.println("\n\nSelect the correct answer for Question 2: (enter 1-4)");
                        System.out.println("\t 1.  What is licking almonds?        3.  What is eating cheese?");
                        System.out.println("\t 2.  What is sucking lemons?         4.  What is chewing gum?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 2 || answer == 3) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 4) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection); 
                
                case 3: System.out.println("\n\nYou\'ve selected:  \t" + question3);
                        System.out.println("\n\nSelect the correct answer for Question 3: (enter 1-4)");
                        System.out.println("\t 1.  What is a chameleon?        3.  What is a giraffe?");
                        System.out.println("\t 2.  What is a beaver?           4.  What is a koala?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 2 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 3) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else 
                            System.out.println(incorrectSelection); 
                
               case 4:  System.out.println("\n\nYou\'ve selected: \t" + question4);
                        System.out.println("\n\nSelect the correct answer for Question 4: (enter 1-4)");
                        System.out.println("\t 1.  What is fear of overworking?         3.  What is fear of oversleeping?");
                        System.out.println("\t 2.  What is fear of overthing?           4.  What is fear of overheating?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 2 || answer == 3 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 1) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else
                            System.out.println(incorrectSelection); 
                            
               case 5:  System.out.println("\n\nYou\'ve selected : \t" + question5);
                        System.out.println("\n\nSelect the correct answer for Question 5: (enter 1-4)");
                        System.out.println("\t 1.  What is when it was made, in 1701?         3.  What is in the 19th century, when it became a symbol of the abolition of slavery?");
                        System.out.println("\t 2.  What is when it rang on July 4, 1776?      4.  What is when it rang on July 5, 1776?");
                        
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 2 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 3) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else
                            System.out.println(incorrectSelection); 
                        
               case 6:  System.out.println("\n\nYou\'ve selected : \t" + question6);
                        System.out.println("\n\nSelect the correct answer for Question 6: (enter 1-4)");
                        System.out.println("\t 1.  What is a log cabin in Kentucky?                     3.  What is a four-story Georgian-style home in Missouri?");
                        System.out.println("\t 2.  What is a two-story clapboard house in Tennessee?    4.  What is a three story brick house in Arkansas?");
                            
                        System.out.print("\nWhat is your response? "); 
                        answer = input.nextInt();         
                        
                        if (answer == 1 || answer == 2 || answer == 4) {
                            
                            System.out.println(loose);
                            break;
                            
                        } else if (answer == 3) {
                            
                            System.out.println(win);
                            break;                 
                            
                        } else
                            System.out.println(incorrectSelection); 
                        
            }//end of switch
    }//end of else
      
      
  }//end of main
}//end of class
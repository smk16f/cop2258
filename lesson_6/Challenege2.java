import java.util.Scanner;

public class Challenege2 {
    public static void main(String[] args)
    {
        //declare variables

        String nameAge = "";
        String fname = "";
        String lname = "";
        String age = "";
        int space;
        int space2;
        int space3;
    
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user for full name
        System.out.println("Please enter full first and last name followed by your age: ");

        //read full name and age from user input
        nameAge = input.nextLine();
        //find the first occurence of space in name provided
        space = nameAge.indexOf(' ');
        fname = nameAge.substring(0, space);
        //store variable
        
        //find the next space for the last name
        space2 = nameAge.indexOf(' ', space + 1);
        //store variable
        lname = nameAge.substring(space + 1, space2);
        //finds the age of the user
        space3 = nameAge.indexOf(' ', space2 + 1);
        
        age = nameAge.substring(space2 + 1);
        
        System.out.println(fname.toUpperCase() + " is " + age + " years old.");
    }
}
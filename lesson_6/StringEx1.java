import java.util.Scanner;

public class StringEx1 {
    public static void main(String[] args)
    {
        //declare variables
        
        String fullName = "";
        String fname = "";
        String mname = "";
        String lname = "";
        char middleInitial;
        int space;
        int space2;
        int space3;
    
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //prompt user for full name
        System.out.println("Please enter full name: ");

        //read full name form user input
        fullName = input.nextLine();
        
        //find the first occurence of space in full name
        space = fullName.indexOf(' ');
        
        //retrieve first name from fullname string using the substring method
        fname = fullName.substring(0, space);
        
        //Printing the first name in caps
        System.out.println("Here is the first name entry: " + fname.toUpperCase());
        
        //find the next space
        space2 = fullName.indexOf(' ', space + 1);
        
        //remove middle name using substring method
        mname = fullName.substring(space + 1, space2);
    
        //getting the middle initial from middle name
        middleInitial = mname.charAt(0);
        
        //print middle initial to terminal
        System.out.println("Here is the middle initial of your entry: " + middleInitial);
        
        lname = fullName.substring(space2);
        
        System.out.println("Here is the last name entry: " + lname.toUpperCase());
        
    }
    
}
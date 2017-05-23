import java.util.Scanner;

public class Challenege1 {
    public static void main(String[] args)
    {
        //declare variables

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
        System.out.println("Please enter full first, middle, and last name: ");
        fname = input.next();
        mname = input.next();
        lname = input.next();
        
        middleInitial = mname.charAt(0);
        
        System.out.println(fname.toUpperCase() + "'s middle initial is: " + middleInitial);
    }
}
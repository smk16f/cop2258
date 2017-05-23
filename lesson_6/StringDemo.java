import java.util.Scanner;

public class StringDemo{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter three words separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("\ns1 is: " + s1);
        System.out.println("s2 is: " + s2);
        System.out.println("s3 is: " + s3);
        
        System.out.println("\nExamples of Methods for String Objects:");
        
        System.out.println("\ns1 in all upper case is: " + s1.toUpperCase());
        System.out.println("s2 in all lower case is: " + s2.toLowerCase());
        System.out.println("s3 in all upper case is: " + s3.toUpperCase());
        
        System.out.println("\nConcatenate s1 with s2 is: " + s1.concat(s2));
        System.out.println("Length of s2 is: " + s2.length());
        System.out.println("Sum of the length of s2 and s3 is: " + (s2.length() + s3.length()));

     }
}

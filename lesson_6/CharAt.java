import java.util.Scanner;

public class CharAt{

     public static void main(String []args){
         
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter your name: ");
        String s = input.nextLine();
        int num = 4;
        char ch = s.charAt(num);
        
        System.out.println("\nThe character in the " + num + "th position is: " + ch);
        System.out.println("\nThe length of the following string "+ s + " is: " + s.length());
        
     }
}

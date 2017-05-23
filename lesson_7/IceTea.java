import java.util.Scanner;

public class IceTea {
        public static void main(String[] args) {
            
            //declare variables
            
            int temp = 0;
            int count = 0;
            
            Scanner input = new Scanner(System.in);
            
            //ask user for input
            System.out.println("Hello, how hot would you like your tea?: ");
            
            //store unser input
            temp = input.nextInt();
            
            //start loop
            while(temp > 112) {
                
                //add ice
                temp--;
                count++;
                System.out.println("Ice added, now the temperature is: " + temp + "\n");
                
                
            }//end loop
            
            System.out.println("Tea is good to drink! There are " + count + " ice cubes added!");
            
        }//end main
}//end class
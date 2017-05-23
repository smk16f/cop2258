import java.util.Scanner;

public class printName{
    
    //function definition of PrintFname method
    public static void PrintFname()
    {
        System.out.println("Steve");
    }//end PrintFname
    
    public static void main(String [] args){   
        
        
            //calling PrintFname
            PrintFname();
            ///calling sumOfTwo
            
            
            System.out.println("The sum is: " + sumOfTwo(5, 19));
            
            int sumInMain = sumOfTwo(5,19);
            
            sumInMain = sumInMain * 2;
            
            System.out .println("The new value is: " + sumInMain);
            
    }//end of main
    
    
    //finds the sum of two numbers
    public static int sumOfTwo(int val1, int val2)
    {
        int result;
        
        result = val1 + val2;
        
        return result;
        
    }//end sumOfTwo
    
}//end of class
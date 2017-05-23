public class SumList {
  /** Main method */

    public static void main(String[] args) {
        
        //Version #1 Method Calls (void)
   
	    sum(1, 10);
	    sum(20, 30);
	    sum(35, 45);
   
   /*
        //Version #2 Method calls using return values
	    System.out.println("Sum from 1 to 10 is " + sum(1, 10));
  	    System.out.println("Sum from 20 to 30 is " + sum(20, 30));
  	    System.out.println("Sum from 35 to 45 is " + sum(35, 45));
   */     
        
    }//end of main


    //Version #1
    public static void sum(int num1, int num2) {
        int sum = 0;
        
        for (int i = num1; i <= num2; i++)
            sum += i;
        
        System.out.println("Sum from " + num1 + " to " + num2 + " is " + sum);
    }//end of sum
    


/*
       //Version #2
       public static int sum(int num1, int num2) {
        int sum = 0;
        
        for (int i = num1; i <= num2; i++)
            sum += i;
        
        return sum;
    }//end of sum 
*/   
    

}//END OF CLASS

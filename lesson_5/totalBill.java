import java.util.*;//imports the .util java library  fro use throughout the program

public class totalBill {
  public static void main(String[] args) { 
      
    double discountRate;
    double shipCost;
    double purchase;
    double totalBill;
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter purchase amount: ");
    purchase = input.nextDouble();
    if (purchase >= 100)
        {
    	discountRate = .25;
    	shipCost = 10.00;
        }
    else
        {
    	discountRate = .10;
    	shipCost = 5.00;
        }
        totalBill = purchase * (1.0 - discountRate) + shipCost;
      System.out.println("Your total today is: " + totalBill);
      }//end main
}//end class
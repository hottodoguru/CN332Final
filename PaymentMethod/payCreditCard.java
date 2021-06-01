package PaymentMethod;

import java.util.*;

public class payCreditCard implements payment{
   
   @Override
   public Boolean doPaid(int total,String promotion,boolean status) {
      Scanner sc= new Scanner(System.in); 
      System.out.print("Enter your credit card number: ");
      String promptPayID= sc.nextLine(); //reads string.
      System.out.println(promptPayID);
      System.out.println("You just paid a "+ promotion +"fee for total "+ total + "with credit card.");
      return status = true ;


   }
}
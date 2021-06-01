package PaymentMethod;
import java.util.*;


public class payPrompt implements payment{
   
   @Override
   public Boolean doPaid(int total,String promotion,boolean status) {
      Scanner sc= new Scanner(System.in); 
      System.out.print("Please Enter your Prompt Pay ID: ");
      String promptPayID= sc.nextLine(); //reads string.
      System.out.println(promptPayID);
      System.out.println("You just paid a "+ promotion +"fee for total "+ total + "with Prompt Pay.");
      return status = true ;


   }
}
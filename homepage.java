import PaymentMethod.*;
import PaymentMethod.payCreditCard;
import Promotion.*;
import Login.*;
import java.util.Scanner; // I use scanner because it's command line.

public class homepage {
    private static  String pay;
    private static String promotion;
    private static boolean status = false;
    private static String total;
    private static PaymentMethod.contextPayment payment;
    public static void main (String[]args){
        System.out.println("Please select how will you login.");
        System.out.println("1.) Facebook");
        System.out.println("2.) Gmail");
        System.out.println("3.) Using Username Password");
        Scanner x = new Scanner (System.in);
        System.out.println("What do you want to login with : ");
        String method = x.nextLine();
        System.out.println("Your Usernam: ");
        String user = x.nextLine();  // Read user input
        System.out.println("Password : ");
        String pass = x.nextLine();  // Read user input
        loginDoing a = new loginDoing(method);
        a.loginOperation(user,pass);
        promoMaker promoMaker = new promoMaker();
        while(true){
            System.out.println("This is booking system. Please selected promotion to read a detail.");
            System.out.println("If you done with reading details and want to proceed to booking please type **done**. ");
            System.out.println("1.) Suite");
            System.out.println("2.) Deluxe");
            String promotion = x.nextLine();
            if(promotion.equalsIgnoreCase("Deluxe")){
                promoMaker.delux.showDetail();
            }
            else if (promotion.equalsIgnoreCase("Suite")){
                promoMaker.suite.showDetail();

            }
            else{
                break;
            }

        }
        System.out.println("Please type Promotion name that you would like to booking.");
        String booked = x.nextLine();
        promotion = booked;
        if(promotion.equalsIgnoreCase("suite")){
            total = promoMaker.getSuitePrice();
        }
        else{
            total = promoMaker.getDeluxPrice();
        }
        System.out.println("Please Select how you want to pay.");
        System.out.println("1.) Credit Card");
        System.out.println("2.) Prompt Pay");
        System.out.println("Your payment method: ");
        pay = x.nextLine();
        if(pay.equalsIgnoreCase("Prompt Pay")){
            payment = new contextPayment(new payPrompt(),user,total,booked,status);
        }  
        else{
            payment = new contextPayment(new payCreditCard(),user,total,booked,status);
        } 

        System.out.println("Done ! ");


    }    
}

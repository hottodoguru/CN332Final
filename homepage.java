import PaymentMethod.*;
import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner; // I use scanner because it's command line.

public class homepage {
    private String name;
    private String promotion;
    public static void main (String[]args){
        System.out.println("Please select how will you login.");
        System.out.println("1.) Facebook");
        System.out.println("2.) Gmail");
        System.out.println("3.) Using Username Password");
        Scanner keyboard = new Scanner (System.in);
        System.out.println("What do you want to login with : ");
    }    
}

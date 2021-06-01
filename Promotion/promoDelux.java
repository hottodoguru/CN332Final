package Promotion;
public class promoDelux implements promotion {

    String price = "500";
    String view = "Sea";
    @Override
    public void showDetail() {
        System.out.println("For 4 people"); 
        System.out.println("Mountain view");
        System.out.println("Price : 500$ per night");
        
    }

    public String getPrice(){
        return price;
    }
    public String getView(){
        return view;
    }
    @Override
    public String toString(){
        return "Deluxe";
    }
    
}
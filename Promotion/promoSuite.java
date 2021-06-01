package Promotion;
public class promoSuite implements promotion {

    public String price = "200";
    public String view = "Mountain";
    @Override
    public void showDetail() {
        System.out.println("For 2 people"); 
        System.out.println("Mountain view");
        System.out.println("Price : 200$ per night");
        
    }

    public String getPrice(){
        return price;
    }
    public String getView(){
        return view;
    }
    @Override
    public String toString(){
        return "Suite";
    }
}

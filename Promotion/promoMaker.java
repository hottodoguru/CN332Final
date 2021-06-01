package Promotion;
public class promoMaker {
    private promotion booked;
    public promoDelux delux;
    public promoSuite suite;
    public promoMaker(){
        suite = new promoSuite();
        delux = new promoDelux();
    }
    public void bookingSuite(){
        booked = suite;
    }
    public void bookigDelux(){
        booked = delux;
    }
    public String getBooked(){
        return booked.toString();
    }
    public String getDeluxPrice(){
        return delux.getPrice();
    }
    public String getSuitePrice(){
        return suite.getPrice();
    }

}

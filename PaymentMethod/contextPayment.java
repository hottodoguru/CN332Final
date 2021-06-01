package PaymentMethod;
public class contextPayment {
    private payment PaymentMethod;
    String name;
    int total;
    String promotion;
    boolean status;
    public contextPayment(payment paid,String name,int total,String promotion,boolean status){
        this.name = name;
        this.total = total;
        this.promotion = promotion;
        this.PaymentMethod = paid;
    }
    public boolean paidOperation(int total,String promotion,boolean status){
        return PaymentMethod.doPaid(total, promotion, status);
    }
}

package PaymentMethod; //Strategy Pattern
public interface payment {
    public Boolean doPaid(int total,String promotion,boolean status);
 }
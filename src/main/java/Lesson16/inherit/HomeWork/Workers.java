package Lesson16.inherit.HomeWork;

public class Workers {
    private String fulName;
    private PaymentType paymentType;

    public Workers (String fulName, PaymentType paymentType){
        this.fulName = fulName;
        this.paymentType = paymentType;
    }
    public String getFulName(){
        return fulName;
}

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public boolean getFullName() {
        return getFullName();
    }

}
    enum PaymentType {
    STAVKA, POGODINNA, VIDRYADNA
}
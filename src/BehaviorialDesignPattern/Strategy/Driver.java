package BehaviorialDesignPattern.Strategy;

public class Driver {
    public static void main(String[] args) {
        CreditCard card =new CreditCard("4597464848");
        card.paytype(2000);
        Upi upi =new Upi("abcd@barodapay");
        upi.paytype(1000);
    }
}

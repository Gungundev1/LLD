package BehaviorialDesignPattern.Strategy;

public class CreditCard implements PaymentStrategy{
    private String cardNumber;
     protected CreditCard(String cardNumber){
         this.cardNumber=cardNumber;
     }

    @Override
    public void paytype(int amount) {
        System.out.println("Payment done using Credit card");
        System.out.println("paid "+amount+" by "+cardNumber);
    }
}

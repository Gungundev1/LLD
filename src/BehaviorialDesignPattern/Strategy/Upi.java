package BehaviorialDesignPattern.Strategy;

public class Upi implements PaymentStrategy{
    private String upiId;
    protected Upi(String upiId){
        this.upiId=upiId;
    }

    @Override
    public void paytype(int amount) {
        System.out.println("Payment done using Upi");
        System.out.println("paid "+amount+" by "+upiId);
    }
}

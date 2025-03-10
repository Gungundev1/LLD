package CreationalDesignPattern.Factory;

public class Driver {
    public static void main(String[] args) {
        Notification email =Factory.notify("Email");
        email.sendNotification("you have a new messages");
        Notification sms=Factory.notify("sms");
        sms.sendNotification("your order is on the way");
    }
}

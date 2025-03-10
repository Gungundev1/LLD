package CreationalDesignPattern.Factory;

public class EmailNotify implements Notification{


    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: "+message);
    }
}

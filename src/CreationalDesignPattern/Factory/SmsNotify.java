package CreationalDesignPattern.Factory;

class SmsNotify implements Notification{


    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: "+message);
    }
}

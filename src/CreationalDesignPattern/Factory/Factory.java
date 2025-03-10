package CreationalDesignPattern.Factory;

public class Factory {
    public static Notification notify(String type){
        if (type==null){
            return null;
        }
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotify();
            case "SMS" -> new SmsNotify();
            default -> throw new IllegalArgumentException("unknown notification type " + type);
        };
    }
}

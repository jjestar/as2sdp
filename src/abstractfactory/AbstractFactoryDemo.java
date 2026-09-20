package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        NotificationService basic = new NotificationService(new BasicNotificationFactory());
        basic.send("Server maintenance tonight");

        NotificationService premium = new NotificationService(new PremiumNotificationFactory());
        premium.send("Server maintenance tonight");
    }
}

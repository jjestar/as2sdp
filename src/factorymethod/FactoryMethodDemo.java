package factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationCreator email = new EmailNotificationCreator();
        NotificationCreator sms = new SmsNotificationCreator();

        email.notify("Your order has shipped");
        sms.notify("Your OTP is 4821");
    }
}

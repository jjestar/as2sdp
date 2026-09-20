package abstractfactory;
interface NotificationFactory {
    NotificationMessage createMessage();
    NotificationSender createSender();
}

class BasicNotificationFactory implements NotificationFactory {
    public NotificationMessage createMessage() {
        return new BasicMessage();
    }
    public NotificationSender createSender() {
        return new BasicSender();
    }
}
class PremiumNotificationFactory implements NotificationFactory {
    public NotificationMessage createMessage() {
        return new PremiumMessage();
    }
    public NotificationSender createSender() {
        return new PremiumSender();
    }
}
